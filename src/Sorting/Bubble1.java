package Sorting;

public class Bubble1 {
    public static void sorting(int[] array){
        for (int turn=0;turn<array.length-1;turn++){
            int swap=0;
        for(int i=0;i<array.length-1-turn;i++){
            if(array[i]>array[i+1]){
              int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                swap++;
            }

        }
            if(swap==0){
                System.out.println("Array is already sorted");
                break;
            }
        }
        for(int data:array){
            System.out.print(data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        int[] array2={5,33,4,4,1};
        int[] array3={1,2,3,4,5};
        sorting(array);
        sorting(array2);
        sorting(array3);
    }
}
