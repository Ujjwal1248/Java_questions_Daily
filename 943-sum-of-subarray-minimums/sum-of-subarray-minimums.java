class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <= n-1; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        st.clear();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        long sum = 0;
        int mod = 1000000000 + 7;

        for(int i = 0; i < n; i++){
            long left = i - nse[i];
            long right = pse[i] - i;
            long total = left * right *arr[i];
            sum = (sum + total) % mod;
        }

        return (int) sum;
    }
}