package Arrays;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[][] matrix ={{1,1,1,1},
                        {1,0,1,1},
                        {1,1,1,1}};
        setzero(matrix);
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                System.out.print(matrix[r][c]+" ");
                }
            System.out.println();
            }
    }
    public static void setzero(int[][] matrix){
        int[] row= new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for(int i=0;i<row.length;i++){
            col[i]= -1;
            row[i]= -1;
        }
        for(int r=0;r<row.length;r++){
            for(int c=0;c<col.length;c++){
                if(matrix[r][c]==0){
                    row[r]=0;
                    col[c]=0;
                }
            }
        }
        for(int i=0;i<row.length;i++){
                for(int j=0;j<col.length;j++){
                    if(row[i]==0 || col[j]==0){
                        matrix[i][j]=0;
                    }
            }
        }
    }
}
