package org.example;

import java.util.Scanner;

public class Question_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            //1st half
            for(int j=i;j<n-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                System.out.print(1+"\t");
            }
            //2nd half
            for(int j=0;j<=i;j++){
                System.out.print(1+"\t");
            }
            for(int j=i;j<n;j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
