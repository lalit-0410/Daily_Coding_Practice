package Array;

public class PrefixArrayMaxSum {
    public static void maxSubArraySum(int[] arr){
        int[] prefixArr =new int[arr.length];

        prefixArr[0]=arr[0];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                currentSum= start==0 ? prefixArr[end]:prefixArr[end]-prefixArr[start-1];

                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max SubArray sum is "+maxSum);
    }
    public static void main(String[] args) {

        int [] arr={1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
