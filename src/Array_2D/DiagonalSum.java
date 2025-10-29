package Array_2D;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix){

        int sum=0;
        //brute force technique where tc=O(n^2)
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                }
//                else if(i+j==matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

        // linear sum where tc=O(n)
        for(int i=0;i<matrix.length;i++){
            //for primary diagonal sum
            sum+=matrix[i][i];
            //for secondary diagonal sum i+j=matrix.length-1 then j=matrix.length-i-1
           if(i!=matrix.length-1-i){
               sum+=matrix[i][matrix.length-i-1];
           }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},
                {5,6,7},
                {9,10,11}};
        System.out.println(diagonalSum(matrix));
    }
}
