package Array;

public class ConstantMemoryReverseArray {
    public static int[] reverse_Array(int[] givenArray){
        int firstIndex=0;
        int lastIndex=givenArray.length-1;
         for (int i=0;i<givenArray.length;i++) {
             if (firstIndex < lastIndex) {
                 givenArray[firstIndex] = givenArray[firstIndex] + givenArray[lastIndex];
                 givenArray[lastIndex] = givenArray[firstIndex] - givenArray[lastIndex];
                 givenArray[firstIndex] = givenArray[firstIndex] - givenArray[lastIndex];
                 firstIndex++;
                 lastIndex--;
             } else if (firstIndex==lastIndex) {
                 givenArray[firstIndex]=givenArray[lastIndex];
             }
         }

        return givenArray;
    }
    public static void main(String[] args) {
        int [] given={1,2,3,45,55,4};
        System.out.print("Given Array :");
        for (int value:given){
            System.out.print(value+" ");
        }
        System.out.print("\nReverse Array :");
        for (int value: reverse_Array(given)) {
            System.out.print(value+" ");
        }
    }
}
