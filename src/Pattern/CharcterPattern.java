package Pattern;

public class CharcterPattern {
    public static void pattern(int c){
        for(int line=1;line<=5;line++)
        {
            for (int charcter=1;charcter<=line;charcter++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(1);
    }

}
