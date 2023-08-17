package org.example;

import java.util.Scanner;

public class Question_32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int k = 1;
        int val = 1;
        for(int i=0;i<n*2-1;i++){
            if(i<n*2/2-1){
                for(int j=0;j<val;j++){
                    if(j%2==0){
                        System.out.print(k+"\t");
                    }
                    else{
                        System.out.print("*\t");
                    }
                }
                k++;
                val+=2;
            }
            else{
                for(int j=i,index=0;j<val+i;j++,index++){
                    if(index%2==0){
                        System.out.print(k+"\t");
                    }
                    else{
                        System.out.print("*\t");
                    }
                }
                k--;
                val-=2;
            }
            System.out.println();
        }
    }
}
