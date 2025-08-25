class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = n2-1; i >= 0; i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek() <= num){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(num, -1);
            }
            else{
                map.put(num, st.peek());
            }
            st.push(num);
        }
        int[] result = new int[n1];
        for(int i = 0; i <n1;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}