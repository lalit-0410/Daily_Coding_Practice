package String;

public class Duplicate {

    public static void main(String[] args) {

        String str="ABCABC";
        StringBuilder result= new StringBuilder();

        for (int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);
            if(result.toString().contains(ch)){
                continue;
            }
            result.append(ch);
        }
        System.out.println(result);
    }
}
