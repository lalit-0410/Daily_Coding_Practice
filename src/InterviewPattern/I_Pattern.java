package InterviewPattern;

import java.util.Scanner;

public class I_Pattern {
    public static void i_pattern(int n){
        //for 1st line
        for(int i=1;i<=n+3;i++){
            //for 1st line star pattern
            for(int j=1;j<n+3;j++){
                if(i==1){
                    System.out.print("*");
                }
                //from 2nd line to second last line
                else if (i>1 && i<n+3) {
                    if(j==((n+2)/2)+1){
                        System.out.print("e");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                //for last line
                else {
                    if(j==1 || j==n+2){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input_num=sc.nextInt();
        if(input_num>1 && input_num%2!=0) {
            i_pattern(input_num);
        }
        else {
            System.out.println("Please input odd number greater than 1");
        }
    }
}
