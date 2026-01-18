class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        solve(s, 0, temp);
        return ans;
    }

    public void solve(String s,int idx, List<String> temp){
        if(idx == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            if(isPalindrome(s, idx, i)){
                temp.add(s.substring(idx,i+1));
                solve(s, i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}