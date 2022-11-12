package Arrays;

public class setmatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},
                        {1,0,0},
                        {1,1,1}};
        setMatrixZeroes(matrix);
        for(int i=0;i<=matrix.length-1;i++){
            for (int j=0;j<=matrix[i].length-1;j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
    } static void setMatrixZeroes(int[][] matrix){
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int[][] arr = new int[row+1][col+1];
        for(int i=0;i<=row;i++){
                for (int j=0;j<=col;j++){
                arr[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<=row;i++){
            for (int j=0;j<=col;j++){
               if(arr[i][j]==0){
                   for(int r=i;r<=i;r++){
                       for (int c=0;c<=col;c++){
                            matrix[r][c]=0;
    }
}
                   for(int r=j;r<=j;r++){
                       for (int c=0;c<=row;c++){
                           matrix[c][r]=0;
        }
    }
}
    }
}}}
