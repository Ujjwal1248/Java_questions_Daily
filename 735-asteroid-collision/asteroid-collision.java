class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (curr > 0)
                list.add(curr);
            else {
                while (!list.isEmpty() && list.get(list.size() - 1) > 0
                        && list.get(list.size() - 1) < Math.abs(asteroids[i])) {
                    list.remove(list.size() - 1);
                }

                if (!list.isEmpty() && list.get(list.size() - 1) == Math.abs(curr)) {
                    list.remove(list.size() - 1);
                } else if (list.isEmpty() || list.get(list.size() - 1) < 0) {
                    list.addLast(curr);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}