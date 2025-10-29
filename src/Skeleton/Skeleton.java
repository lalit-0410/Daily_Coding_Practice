package Skeleton;

public class Skeleton {
    private Skeleton(){

    }
    private static Skeleton INSTANCE=null;


    public static Skeleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new Skeleton();
        }
        return INSTANCE;
    }
    public void m1(){
        System.out.println("heehheh");
    }
}
