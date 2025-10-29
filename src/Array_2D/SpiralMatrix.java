package Array_2D;

public class SpiralMatrix {
    public static void printSpiral(int[][] matrix){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            //top startRow fix then startCol to endCol
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");

            }

            // right endCol fix then startRow+1 to endRow
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");

            }

            //bottom endRow fix then endCol-1 to startCol
            for(int j=endCol-1; j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left startCol fix then endRow-1 to startRow+1
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
       // System.out.println();

    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},
                {4,5,6},
                {7,8,9}};
        printSpiral(matrix);
    }
}
