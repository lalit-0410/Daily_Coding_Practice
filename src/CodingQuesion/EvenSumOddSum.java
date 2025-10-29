package CodingQuesion;

import java.util.Scanner;

public class EvenSumOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your starting and last range ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int evenSum=0, oddSum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                oddSum=i+oddSum;
            }
            else{
                evenSum=i+evenSum;
            }
        }
        System.out.println("Sum of odd number "+oddSum);
        System.out.println("Sum of even number "+evenSum);
    }
}
