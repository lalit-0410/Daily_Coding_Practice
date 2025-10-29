package InterviewPattern;

public class Horizontal_I {
    public static void horizontal_I(int n){
        //for 1st line
        for(int i=1;i<n+3;i++){
            for(int j=1;j<=n+3;j++){
                //for 1st row and last row
                if(i==1 || i==n+2){
                    if(j==1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                } else {
                    if(i!=((n+2)/2)+1){
                        if(j==1 ||j==n+3){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if(j==1 || j==n+3){
                            System.out.print("*");
                        }
                        else {
                            System.out.print("e");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        horizontal_I(n);
    }
}
