class Solution {
    public void solveSudoku(char[][] board) {
        Sudoku(board, 0, 0);
    }

    public boolean Sudoku(char[][] board, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return Sudoku(board, row, col + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (Sudoku(board, row, col + 1))
                        return true;
                    board[row][col] = '.';
                }
            }
            return false;
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int val) {
        char ch = (char) (val + '0');
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch || board[i][col] == ch)
                return false;
        }
        int r = (row / 3)*3;
        int c = (col / 3)*3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == ch)
                    return false;
            }
        }

        return true;
    }

}