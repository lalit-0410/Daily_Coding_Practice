package BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(5&6);//101 & 110 = 100 ==> 4
        System.out.println(5|6);//101 | 110 = 111 ==> 7
        System.out.println(~5); //101 > 010 +1 ==>011 ==>-6
        System.out.println(5<<2);//101 <<2 ==> 10100==> 20
        System.out.println(6>>1);//110 >> 1 ==> 11==>3
    }
}
