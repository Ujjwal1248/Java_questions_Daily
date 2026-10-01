class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();
        helper(board, n, 0, ans);
        return ans;
    }

    public void helper(char[][] board, int n, int row, List<List<String>> ans) {
        if (row == n) {
            List<String> curr = new ArrayList<>();
            for (char[] ch : board) {
                curr.add(new String(ch));
            }
            ans.add(curr);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (canPlace(board, n, row, i)) {
                board[row][i] = 'Q';
                helper(board, n, row + 1, ans);
                board[row][i] = '.';
            }
        }
    }

    public boolean canPlace(char[][] board, int n, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}