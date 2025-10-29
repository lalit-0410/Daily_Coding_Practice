package CodingQuesion;

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        //To range
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        //To store in array
        int[] primes = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }
        }

        // To print prime numbers
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

        //Sum of prime number
        int evenIndex=0,oddIndex=0;
        for (int i=0;i<primes.length;i++){
            if(i%2==0){
                evenIndex=evenIndex+primes[i];
            }
            else {
                oddIndex=oddIndex+primes[i];
            }
        }
        System.out.println("Sum of even index :"+evenIndex);
        System.out.println("Sum of odd index :"+oddIndex);
    }
    //Function to prime

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}