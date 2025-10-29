package Pattern;

public class Diamond {
    public static void main(String[] args) {

        diamond(4);
    }
    public static void diamond(int number){
        //for 1st half
        //line
        for(int line=1;line<=number;line++) {
            //for space
            for(int space=1;space<=(number-line);space++){
                System.out.print(" ");
            }
            //for star
            for (int star=1;star<=(2*line-1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for 2nd half
        for(int line=number;line>=1;line--) {
            //for space
            for (int space = 1; space <= (number - line); space++) {
                System.out.print(" ");
            }
            //for star
            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
