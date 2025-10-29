package Pattern;

public class HallowRhombus {
    public static void main(String[] args) {

        int number = 5;
        //line 1 to 5
        for (int line = 1; line <= number; line++) {
            //for space (number-line)
            for (int space = 1; space <= (number - line); space++) {
                System.out.print(" ");
            }
                //for star
                for (int star = 1; star <= number; star++) {
                    if (star == 1 || star == number || line == 1 || line == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();

            }
        }
    }

