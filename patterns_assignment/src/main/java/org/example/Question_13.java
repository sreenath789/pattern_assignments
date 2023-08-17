package org.example;

import java.util.Scanner;

public class Question_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        //1st half
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        //2nd half
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
