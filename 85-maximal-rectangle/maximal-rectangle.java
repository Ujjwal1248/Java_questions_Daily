class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            // Update histogram heights
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            // Calculate max rectangle area for this histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int height = heights[st.pop()];
                int pse = st.isEmpty() ? -1 : st.peek();
                int nse = i;
                maxArea = Math.max(maxArea, height * (nse - pse - 1));
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int height = heights[st.pop()];
            int pse = st.isEmpty() ? -1 : st.peek();
            int nse = n;
            maxArea = Math.max(maxArea, height * (nse - pse - 1));
        }

        return maxArea;
    }
}
