package Recursion;

public class Factorial {
    public static int fact(int num){
        //base case
        if(num==0 ||num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(fact(num));
    }
}
