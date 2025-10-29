package CodingQuesion;

import java.util.Scanner;

public class PresentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find ");
        int find = sc.nextInt();

        boolean found=false;
        for (int i = 0; i < size; i++) {
            if (find == arr[i]) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Present "+find);
        }
        else {
            System.out.println("Not present "+find);
        }

    }
}
