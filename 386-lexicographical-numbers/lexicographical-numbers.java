class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i<= 9; i++){
            helper(i, n, result);
        }
        return result;
    }
    public void helper(int start, int n, List<Integer> result){
        if(start > n){
            return;
        }
        result.add(start);
        for(int i = 0; i <= 9; i++){
            if(start * 10 + i > n) return;
            helper(start * 10 + i, n, result);
        }
    }
}