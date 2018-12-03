package com.github.vedeshkin.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vedeshkin on 12/3/2018.
 * All right reserved.
 */
public class ReverseString {

    public static void main(String[] args) {
        String sInput;
        System.out.println("Enter a new string to reverse or enter an empty string to exit:");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            sInput = br.readLine();
            while (!sInput.isEmpty() ){
                StringBuilder sb =new StringBuilder(sInput);
                System.out.println(sb.reverse());
                System.out.println("Enter a new string to reverse or enter an empty string to exit:");
                sInput = br.readLine();
                }

            System.exit(0);
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
