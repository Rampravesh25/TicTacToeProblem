package com.game;

public class UC1TicTacTaeGame {
   void m1() {

        char[] val=new char[10];
        val[1]='A';
        val[2]='B';
        val[3]='x';
        val[4]='o';
        val[5]='x';
        val[6]='x';
        val[7]='o';
        val[8]='x';
        val[9]='x';

       System.out.println(val[1]);
    }

    public static void main(String[] args) {
        UC1TicTacTaeGame uc = new UC1TicTacTaeGame();
         uc.m1();

    }
}
