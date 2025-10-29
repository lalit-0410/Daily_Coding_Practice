package Array;

public class BinarySearch {
    public static int binarySearch(int[] numbers,int find_element){
        int start=0;
        int end=numbers.length-1;

        while (start<=end){
            int mid=(start+end)/2;

            //comparison
            if(numbers[mid]==find_element){
                return mid;

            }//right
            else if (numbers[mid]<find_element) {
                start=mid+1;

            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6,7};
        int  find_element=4;
        System.out.println("Find number index is :"+binarySearch(numbers,find_element));
    }
}
