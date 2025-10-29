package Array;

import java.util.Scanner;

public class Pair_in_Array {
    public static void pairs_in_array(int[] array){
        int totalPairs=0;
        System.out.println("\nPairs in array :");
       //for particular index like [1,2],[1,3],[1,4][1,5],[1,6] here 1 is same
        for (int i=0;i<array.length;i++){
            // with pair with 1 so index= i+1
            for (int j=i+1;j<array.length;j++){

                System.out.print("("+array[i]+","+array[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+totalPairs);


    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        System.out.print("Given array :");
        for (int value:array){
            System.out.print(value+" ");
        }
        pairs_in_array(array);
    }
}
