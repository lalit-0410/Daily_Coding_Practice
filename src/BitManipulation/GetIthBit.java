package BitManipulation;

public class GetIthBit {
    static int getIthBit(int num,int position){
        int bitmask=1<<position;
        if((num & bitmask)==0){
            return 0;

        }
        else
            return 1;
    }


    static int setIthbit(int num,int pos){
        int bitMask=1<<pos;
        return num | bitMask;
    }
    static int clearIthBit(int num,int pos){
        int bitMask=~(1<<pos);
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println( getIthBit(15,2));
        System.out.println(setIthbit(10,0));
        System.out.println(clearIthBit(10,1));
    }
}
