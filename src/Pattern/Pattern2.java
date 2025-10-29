package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        //rows
        for(int r=1;r<=n;r++){
            //column
            for(int c=1;c<=n;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
