package org.example;

public class Question_20 {

    public static void main(String[] args) {
        int n = 7;
        int sp = n/2;
        int star = 1;
        for(int i=0;i<n;i++){

            //1st half
            if(i<n/2){
                for(int j=0;j<sp;j++){
                    System.out.print("\t");
                }
                for(int j=0;j<star;j++){
                    if(j==0 || j==star-1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                sp-=1;
                star+=2;
            }
            //2nd half
            else{
                for(int j=0;j<sp;j++){
                    System.out.print("\t");
                }
                for(int j=0;j<star;j++){
                    if(j==0 || j==star-1){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                sp+=1;
                star-=2;
            }
            System.out.println();
        }
    }
}
