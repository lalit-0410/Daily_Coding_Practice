package Pattern;

public class HallowRectangle {

    public static void hallowRectangle(int totalRows, int totalCols)
    {
        for (int line=1;line<=totalRows;line++){
            for (int star=1;star<=totalCols ;star++){
                if(line==1||line==totalRows||star==totalCols||star==1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hallowRectangle(4,5);
    }
}
