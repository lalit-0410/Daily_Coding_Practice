package CodingQuesion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] rev=new  int[size];
        System.out.println("Enter values ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are ");
        for(int value:arr){
            System.out.print(value+" ");
        }
        System.out.println("\nReverse elements are ");
        for(int i=0;i<size;i++){
            rev[arr.length-1-i]=arr[i];

        }
    for(int values:rev){
        System.out.print(values+" ");
    }

    }
}
