package org.example;

import java.util.Scanner;

public class Question_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sp=n-1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=i;j<n;j++){
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
            sp++;
        }
    }
}
