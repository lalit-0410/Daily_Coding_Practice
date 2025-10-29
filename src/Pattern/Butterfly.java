package Pattern;

public class Butterfly {
    public static void butterFly(int n){
        //for 1st half
        for (int i=1;i<=n;i++){
            //star==i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space==2(n-i)
            for (int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            //star==i
            for (int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for (int i=n;i>=1;i--){
            //star==i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space==2(n-i)
            for (int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            //star==i
            for (int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterFly(4);
    }
}
