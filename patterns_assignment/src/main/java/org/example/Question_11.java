package org.example;

import java.util.Scanner;

public class Question_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<=2*i;j++){
                if(j%2==0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
