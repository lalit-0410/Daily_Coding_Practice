package Array;



public class Demo {
    public static void horizontal_I(int n) {
        // Validate input
        if (n < 3 || n % 2 == 0) {
            System.out.println("Invalid input! n must be an odd number >= 3");
            return;
        }

        // Print top row with n+2 stars
        for (int i = 0; i < n + 2; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Print middle rows with single 'e'
        for (int i = 0; i < n + 1; i++) {
            System.out.println("e");
        }

        // Print bottom row with n+1 stars
        for (int i = 0; i < n + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3; // Test with n=3 first
        horizontal_I(n);

        // You can test with other odd numbers too
        System.out.println("\nTesting with n=5:");
        horizontal_I(5);
    }
}
