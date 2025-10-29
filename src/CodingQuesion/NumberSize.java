package CodingQuesion;

public class NumberSize {
    public static void main(String[] args) {
        int number=1235445;
        int temp=number;
        int count=0;
        if (number==0){
            count++;
        }
        else {
            while (temp!=0){
                temp=temp/10;
                count++;

            }
        }
        System.out.println("Size :"+count);
    }
}
