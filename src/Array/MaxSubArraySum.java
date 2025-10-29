package Array;

public class MaxSubArraySum {
        public  static  void max_sub_Array_sum (int[] numbers){
            int currectsum=0;
            int maxsum=Integer.MIN_VALUE;
            for (int i=0;i<numbers.length;i++){
                for(int j=i;j<numbers.length;j++)

                {
                    currectsum=0;
                    for (int k=i;k<=j;k++){
                        currectsum=currectsum+numbers[k];
                    }
                    System.out.println("Current sum is "+currectsum);
                    if (maxsum<currectsum){
                        maxsum=currectsum;
                    }
                }

            }
            System.out.println("Max subarray sum is  : "+maxsum);
        }
        public static void main(String[] args) {
            int[] numbers={2,4,-6,8};
            max_sub_Array_sum(numbers);
        }
    }


