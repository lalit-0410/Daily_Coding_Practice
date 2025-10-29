package Array_2D;

import java.util.Scanner;

public class Creation {
    public static boolean search(int[][] matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {


        //define size of 2-d array
        int[][] matrix = new int[3][3];
        int rows = matrix.length;
        int columns = matrix[0].length;
        Scanner sc=new Scanner(System.in);
        //input
        for (int i = 0; i < rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(search(matrix,5));

    }
}