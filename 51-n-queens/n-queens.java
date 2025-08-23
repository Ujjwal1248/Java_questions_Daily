class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();
        nQueens(board, 0, n, ans);
        return ans;
    }

    public void nQueens(char[][] board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) {
                temp.add(new String(r));
            }
            ans.add(temp);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1, n, ans);
                board[row][i] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int n){
        for(int i = 0; i < row; i++){
            if(board[row][i] == 'Q' || board[i][col] == 'Q'){
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
}