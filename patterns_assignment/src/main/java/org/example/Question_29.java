package org.example;

import java.util.Scanner;

public class Question_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                if(j==0){
                    System.out.print(k+"\t");
                }
                else{
                    System.out.print(0+"\t");
                }
            }

            for(int j=0;j<=i;j++){
                if(j==i){
                    System.out.print(k+"\t");
                }
                else{
                    System.out.print(0+"\t");
                }
            }

            k++;
            System.out.println();
        }
    }
}
