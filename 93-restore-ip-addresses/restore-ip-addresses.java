class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<String> result) {
        if (path.size() == 4 && start == s.length()) {
            result.add(String.join(".", path));
            return;
        }
        if (path.size() >= 4) return;

        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String segment = s.substring(start, start + len);
            if ((segment.startsWith("0") && segment.length() > 1) || Integer.parseInt(segment) > 255) continue;
            path.add(segment);
            backtrack(s, start + len, path, result);
            path.remove(path.size() - 1);
        }
    }
}
