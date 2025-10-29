package CodingQuesion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of fibonacci series ");
        int num=sc.nextInt();

        System.out.println("Enter 1st two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=num;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;

        }
    }
}
