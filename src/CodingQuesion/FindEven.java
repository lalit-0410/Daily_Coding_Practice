package CodingQuesion;

import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements are ");
        for(int elements:arr){
            System.out.println(elements);
        }

        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println("Even "+arr[i]);
            }
            else {
                System.out.println("Odd "+arr[i]);
            }
        }

    }
}
