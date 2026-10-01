class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9)
            return true;
        if (board[row][col] != '.')
            return solve(board, row, col + 1);
        else {
            for (int i = 1; i <= 9; i++) {
                if (correct(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if(solve(board, row, col + 1)) return true;
                    board[row][col] = ('.');
                }
            }
            return false;
        }
    }

    public boolean correct(char[][] board, int row, int col, int val) {
        char curr = (char) (val + '0');
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == curr || board[row][i] == curr)
                return false;
        }
        int a = (row / 3) * 3;
        int b = (col / 3) * 3;
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                if (board[i][j] == curr)
                    return false;
            }
        }
        return true;
    }
}