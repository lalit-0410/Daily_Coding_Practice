package Array;

public class LargestNumber {
    public static int largestNumber(int[] numberlist){
        int largestNum=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numberlist.length;i++){

            if(largestNum<numberlist[i]){
                largestNum=numberlist[i];
            }
            if(smallest>numberlist[i]){
                smallest=numberlist[i];
            }
        }
        System.out.println("Smallest "+smallest);
        return largestNum;

    }
    public static void main(String[] args) {
    int[] numberList={1,88,54,20,66,15};
    int largestNum=largestNumber(numberList);
        System.out.println(largestNum);
    }
}
