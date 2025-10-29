package Array_2D;

public class CountKey {
    public static void count(int[][] array, int key){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array[0].length;j++){
                if(array[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("Occurance of "+key+" is "+count);
    }
    public static void main(String[] args) {
        int [][] array={{1,2,3},{2,4,2}};
        int key=20;
        count(array,key);
    }
}
