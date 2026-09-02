package BitManipulation;

public class OddOrEven {
    static void oddOrEven(int n){
        int bitmask=1;
        if((n&bitmask)==1){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(154);
        oddOrEven(124);
    }
}
