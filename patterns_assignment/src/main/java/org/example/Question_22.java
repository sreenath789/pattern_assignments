package org.example;

import java.util.Scanner;

public class Question_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sp = -1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=i;j<n;j++){
                if(i==0 && j==n-1){
                    continue;
                }
                System.out.print("*\t");
            }
            System.out.println();
            sp+=2;
        }
    }
}
