package Array;

public class LargestNumberFind {
    public static String largestNum(int[] numbers,int largest){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return "Largest number is :"+largest;
    }

    public static void main(String[] args) {
        int[] numbers={1,55,68,250,15,88,94};
        int largestNum=Integer.MIN_VALUE;
        String num = largestNum(numbers, largestNum);
        System.out.println(num);
    }
}
