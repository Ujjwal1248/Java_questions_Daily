class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int nse = i;
                int element = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int nse = n;
            int element = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
        }
        return maxArea;
    }
}