package CodingQuesion;

public class ReverseNumber {
    public static int reverse(int number){
        int reverseNum=0;
        while (number>0){
            int digit=number%10;
            reverseNum=reverseNum*10+digit;
            number=number/10;
        }
        return reverseNum;

    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
