class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        //PSE
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]) st.pop();
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        st.clear();
        //NSE
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) st.pop();
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        long total = 0;
        int MOD = 1000000007;
        for(int i = 0; i < n; i++){
            int prev = i - pse[i];
            int next = nse[i] - i;
            total = (total + (long)arr[i] * prev * next) % MOD;
        }
        return (int)total;
    }
}