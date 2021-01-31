package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        TicTacToe ttt = new TicTacToe ();
        ttt.marks [0][0] = Mark.Cross;
        ttt.marks [1][0] = Mark.Nought;
        ttt.marks [2][0] = Mark.Cross;
        ttt.marks [1][1] = Mark.Nought;
        ttt.marks [0][2] = Mark.Cross;
        ttt.marks [1][2] = Mark.Nought;
        System.out.println (ttt.gameOver ());



    }
}
