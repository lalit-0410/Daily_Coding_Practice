package CodingQuesion;

public class EvenDigitFromNumber {
    public static void evenDigit(int number){
       while (number>0){
           int digit=number%10;
           if(digit%2==0){
               System.out.print(digit);
           }
           number=number/10;
       }

    }
    public static void main(String[] args) {
        evenDigit(1234);
    }
}
