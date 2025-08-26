class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ge = new int[n];
        for(int i = 2*n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i % n]){
                st.pop();
            }
            if(i < n){
                if(st.isEmpty()){
                    ge[i] = -1;
                }
                else{
                    ge[i] = st.peek();
                }
            }
            st.push(nums[i % n]);
        }
        return ge;
    }
}