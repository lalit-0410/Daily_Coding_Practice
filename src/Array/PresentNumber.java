package Array;

public class PresentNumber {
    //function to check number is present by linear search method
    public static String findNumber(int[] list, int findNumber){
        for(int getValue:list){
            if(getValue==findNumber){
                return "Present :"+findNumber;
            }
        }
        return "Not present :"+findNumber;

    }
    public static void main(String[] args) {
        int[] list={1,2,3,5,6,7};
        int findNumber=58;
        String ans=findNumber(list,findNumber);
        System.out.println(ans);

    }
}
