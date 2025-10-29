package CodingQuesion;

import java.util.Scanner;

public class CountVowel  {
    public static void main(String[] args) {
        int i,vowel=0,constant=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String s=sc.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    vowel++;
                }
                else {
                    constant++;
                }

            }
        }
        System.out.println("Total Vowel are "+vowel);
        System.out.println("Total Constants are "+constant);


    }
}
