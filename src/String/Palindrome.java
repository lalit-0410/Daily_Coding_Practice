package String;

public class Palindrome {
    public static boolean palindrome(String str){
//        int start=0;
//        int end=str.length()-1;
//        boolean strPalim=false;
//        while (start<end){
//           if(str.charAt(start)==str.charAt(end)){
//               strPalim=true;
//           }
//            start++;
//            end--;
//
//
//        }
//        return strPalim;
        int size=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(size-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str="noone";
        System.out.println( palindrome(str));
    }
}
