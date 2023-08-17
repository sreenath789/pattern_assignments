package org.example;

import java.util.Scanner;

public class Question_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int k=1;
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                System.out.print(k +"\t");
                k++;
            }

            for(int j=0;j<=i;j++){
                System.out.print(k+"\t");
                k--;
            }
            count++;
            k=count;
            System.out.println();
        }
    }
}
