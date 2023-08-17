package org.example;

import java.util.Scanner;

public class Question_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sp = n*2-3;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<=i;j++){
                if(i==n-1 && j==n-1){
                    continue;
                }
                System.out.print("*\t");
            }
            System.out.println();
            sp-=2;
        }
    }
}
