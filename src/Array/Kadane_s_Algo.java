package Array;

public class Kadane_s_Algo {
    public static void kadane(int[] arr){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++) {
                currentSum = currentSum + arr[i];
                if(currentSum<0){
                    currentSum=0;
                }

            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("The maximum sub array sum is "+maxSum);
    }

    //when all arrays numbers are negative

    public static void kadane_negative(int[] arr){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int value:arr){
            if(value<0){
                cs=value;
            }
           ms=Math.max(ms,cs);
        }
        System.out.println("Max sum is "+ms);
    }
    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
        int[] arr2={1,-2,6,-1,3};
        kadane(arr2);
        int [] arr3={-10,-2,-3,-1};
        kadane_negative(arr3);
    }
}
