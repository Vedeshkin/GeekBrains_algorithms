package com.github.vedeshkin.homework4;

import java.util.Scanner;

/**
 * Created by Vedeshkin on 12/11/2018.
 * All right reserved.
 */
public class PowerOfTheNumber {
    public static int power(int base, int exp){
        if (exp !=0){
            return (base * power(base, exp-1));
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a base : ");
            int base = sc.nextInt();
            System.out.println("Enter the exponent:");
            int exp = sc.nextInt();
            System.out.println(power(base,exp));
        }


    }


}
