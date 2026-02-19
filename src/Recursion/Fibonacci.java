package Recursion;

public class Fibonacci {
    static int fibo(int size){
        if(size==0){
            return 0;
        } else if (size==1) {
            return 1;
        }
        return fibo(size-1)+fibo(size-2);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            System.out.println(fibo(i));
        }
    }
}
