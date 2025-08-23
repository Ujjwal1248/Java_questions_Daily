class Solution {
    public void solveSudoku(char[][] board) {
        Sudoku(board, 0, 0);
    }

    public boolean Sudoku(char[][] board, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return Sudoku(board, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isSafe(board, row, col, val)) {
                    board[row][col] = (char)(val + '0');
                    if(Sudoku(board, row, col + 1)) return true;
                    board[row][col] = '.';
                }
            }
        return false;
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int val) {
        char ch = (char)(val + '0');
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch || board[row][i] == ch) {
                return false;
            }
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}