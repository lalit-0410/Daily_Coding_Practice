package CodingQuesion;

import java.util.Scanner;

public class CoffeeCup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Thank you for coming ");
        System.out.println("1.Are you purchasing something \n 2.Not");
        int choice=sc.nextByte();
        switch (choice){
            case 1:
                int sales=0;
                System.out.println("Enter your item");
                while(sales>=0){

                    String item=sc.nextLine();
                    sales++;
                    if(sales>6){
                        System.out.println("Congratulation you won extra cup");
                        break;
                    }

                }

                break;
            case 2:
                break;
        }
    }
}
