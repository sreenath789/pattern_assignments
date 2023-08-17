package org.example;

import java.util.Scanner;

public class Question_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int sp = -1;

        for(int i=0;i<n;i++){
            //1st half
            if(i<=n/2){
                for(int j=i;j<=n/2;j++){
                    System.out.print("*\t");
                }
                for(int j=0;j<sp;j++){
                    System.out.print("\t");
                }
                for(int j=i;j<=n/2;j++){
                    if(i==0&&j==n/2){
                        continue;
                    }
                    System.out.print("*\t");
                }
                if(i<n/2){
                    sp+=2;
                }
            }
            //2nd half
            else{
                sp-=2;
                for(int j=0;j<=i-n/2;j++){
                    System.out.print("*\t");
                }
                for(int j=0;j<sp;j++){
                    System.out.print("\t");
                }
                for(int j=0;j<=i-n/2;j++){
                    if(i==n-1&&j==i-n/2){
                        continue;
                    }
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
