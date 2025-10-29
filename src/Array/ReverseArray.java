package Array;

public class ReverseArray {
    public static int[] reverseArray(int[] givenArray){
        int first=0;
        int last=givenArray.length-1;
        while (first<last){
          givenArray[first]=givenArray[first]+givenArray[last];
          givenArray[last]=givenArray[first]-givenArray[last];
          givenArray[first]=givenArray[first]-givenArray[last];
            first++;
            last--;
        }
        return givenArray;
    }
    public static void main(String[] args) {
        int[] givenArray={1,2,3,4,5};
        System.out.print("Given Array :");
        for (int value:givenArray){
            System.out.print(value+" ");
        }
        System.out.print("\nReverse Array :");
        for (int value: reverseArray(givenArray)) {
            System.out.print(value+" ");
        }
    }
}
