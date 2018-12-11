package com.github.vedeshkin.homework4;

/**
 * Created by Vedeshkin on 12/11/2018.
 * All right reserved.
 */
public class HanoiTower {

    public void solvePuzzle(int n, char from, char to, char aux){
        if (n ==1){
            System.out.println("Move disk 1 from rod " +  from + " to rod " + to);

        }else {
            solvePuzzle(n-1,from,aux,to);
            System.out.println("Move disk " +n+  " from rod " +  from + " to rod " + to);

            solvePuzzle(n-1,aux,to,from);
        }
    }

    public static void main(String[] args) {

        int n =4;
        HanoiTower ht = new HanoiTower();
        ht.solvePuzzle(n,'A','B','C');

    }
}
