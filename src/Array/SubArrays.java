package Array;

public class SubArrays {
    public  static  void subArrays(int[] numbers){
        int ts=0;
        for (int start=0;start<numbers.length;start++){
            for(int end=start;end<numbers.length;end++){
                for (int value=start;value<=end;value++){
                    System.out.print(numbers[value]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays are : "+ts);
    }
    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10};
        subArrays(numbers);
    }
}
