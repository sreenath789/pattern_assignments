package org.example;

import java.util.Scanner;

public class Question_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int k=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(k+"\t");
                }
                k--;
            }
            System.out.println();
            k=n;
        }
    }
}
