package Recursion;

public class PrintDec {
    public static void printDec(int num){
        //1. base case
        if(num==1){
            System.out.println(num);
            return;
        }
        //2. work
        System.out.print(num+" ");
        //3. inner call
        printDec(num-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
