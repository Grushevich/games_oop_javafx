package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean horiz = true;
        boolean vertic = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == j && board[i][j] != 0) {
                    int cell = 0;
                    while (cell < board[i].length) {
                        if (board[i][cell] != 1) {
                            horiz = false;
                            break;
                        }
                        cell++;
                    }
                    int row = 0;
                    while (row < board.length) {
                        if (board[row][j] != 1) {
                            vertic = false;
                            break;
                        }
                        row++;
                    }

                }
            }
        }
        return (horiz || vertic);
    }
}
