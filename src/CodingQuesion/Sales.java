package CodingQuesion;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sales ");
        int sales=sc.nextInt();
        if(sales>=30 && sales<=50){
            System.out.println("D");
        }
        else if (sales>=51 && sales<=60) {
            System.out.println("C");

        }
        else if (sales>=61 && sales<=80) {
            System.out.println("B");

        }
        else if (sales>=80) {
            System.out.println("A");

        } else{
            System.out.println("Not profitable ");
        }
    }
}
