package Pattern;

public class InvertedPyramid {
    public static void main(String[] args) {
        int totalRows=4;
        //line no
        for (int i=1;i<=totalRows;i++){
            //for empty space
            for (int j=1;j<=totalRows-i;j++) {
                System.out.print(" ");
            }
                //for star
                for (int k=1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
            }


    }
}
