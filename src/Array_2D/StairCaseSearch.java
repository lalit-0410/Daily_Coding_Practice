package Array_2D;

public class StairCaseSearch {
    public static boolean stairSearch(int[][] matrix,int key){
        //cell is top right
        int row=0;
        int col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at index ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
     }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},
                {5,6,7},
                {9,10,11}};
        int key=50;
        stairSearch(matrix,key);
    }
}
