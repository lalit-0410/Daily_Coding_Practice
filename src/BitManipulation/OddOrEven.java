package BitManipulation;

public class OddOrEven {
    public static void oddEven(int n){
        int bitmask=1; //0001

        //5=101
        //& 001
        //  001 (LSB) ==1 then odd, 0 then even

        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(4);
        oddEven(7);
    }
}
