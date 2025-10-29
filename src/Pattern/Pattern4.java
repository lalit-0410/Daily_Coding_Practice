package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
    pattern(5);
    }
    public static void pattern(int n){
        for(int line=1;line<=n;line++){
            for(int col=1;col<=line;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
