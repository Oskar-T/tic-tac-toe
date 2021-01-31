package com.company;

public class TicTacToe {

    public TicTacToe() {
        marks = new Mark[N][N];
    }

    boolean isRow() {

        crossCounter = 0;
        noughtCounter = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (marks[r][c] == isNought) {
                    noughtCounter++;
                } else if (marks[r][c] == isCross) {
                    crossCounter++;
                }
            }
            if (crossCounter == 3 || noughtCounter == 3) {
                return true;
            }
            crossCounter = 0;
            noughtCounter = 0;

        }
        return false;
    }

    boolean isColumn() {
        crossCounter = 0;
        noughtCounter = 0;
        for (int c = 0; c < N; c++) {
            for (int r = 0; r < N; r++) {
                if (marks[r][c] == isNought) {
                    noughtCounter++;
                } else if (marks[r][c] == isCross) {
                    crossCounter++;
                }
            }
            if (crossCounter == 3 || noughtCounter == 3) {
                return true;
            }
            crossCounter = 0;
            noughtCounter = 0;


        }
        return false;
    }

    boolean isObliquely() {

        crossCounter = 0;
        noughtCounter = 0;

        for(int i = 0; i < N; i++) {
            if (marks[i][i] == isNought) {
                noughtCounter++;
            } else if (marks[i][i] == isCross) {
                crossCounter++;
            }

            if (crossCounter == 3 || noughtCounter == 3) {
                return true;
            }
        }

        crossCounter = 0;
        noughtCounter = 0;

        for(int r = 0, c = 2; r < N; r++, c--) {

            if (marks[r][c] == isNought) {
                noughtCounter++;
            } else if (marks[r][c] == isCross) {
                crossCounter++;
            }
            if (crossCounter == 3 || noughtCounter == 3) {
                return true;
            }

        }

        return false;
    }

    boolean gameOver() {

        return isRow() || isColumn() || isObliquely();

    }

    Mark isNought = Mark.Nought;
    Mark isCross = Mark.Cross;
    private final int N = 3;
    public Mark[][] marks;
    private int noughtCounter = 0;
    private int crossCounter = 0;
}
