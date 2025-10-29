package CodingQuesion;

import java.util.Scanner;

public class InRangePrime {
    public static void main(String[] args) {
        int st,last;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range ");
         st=sc.nextInt();
         last=sc.nextInt();
        System.out.println("Prime number between"+st+" to "+last);

        for(int i=st;i<=last;i++){
            boolean isPrime = true;

            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.print(i+"  ");
            }

        }


    }
}
