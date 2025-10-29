package String;

public class SubString {
    public static void subString(String str, int si, int ei){
        for(int i=si; i<ei; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="helloworld";
        subString(str,3,5);
    }
}
