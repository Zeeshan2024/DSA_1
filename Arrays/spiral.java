package Arrays;

import java.util.ArrayList;

    public class spiral {
        public static void main(String[] args) {
            int[][] mat = { {1,2,3},
                    {8,9,4},
                    {7,6,5} };
            ArrayList<Integer> list = new ArrayList<>();
            int n =5;
            //        int[][] matrix = new int[3][3];
            //        int [] arr = new int[3*3];
            //        for (int i=0;i<3*3;i++){
            //            arr[i] = i+1;
            //        }
            //        System.out.println(Arrays.toString(arr));
            int result[][] = spiralMatrixII(n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static int[][] spiralMatrixII(int a){
            int[][] arr = new int[a][a];
            int left = 0;
            int top =0;
            int right = arr.length-1;
            int bottom = arr[0].length-1;
            int [] mat = new int[(a*a)];
            for (int i=0;i<(a*a);i++){
                mat[i] = i+1;
            }

            int j=0;
            while(top<=bottom && left<=right ) {

                for (int i = left; i <= right; i++) {
                    arr[top][i]= mat[j];
                    j++;
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    arr[i][right]= mat[j];
                    j++;
                }
                right--;
                if(top<=bottom) {
                    for (int i = right; i >= left; i--) {
                        arr[bottom][i] = mat[j];
                        j++;
                    }
                    bottom--;
                }
                if(left<=right) {
                    for (int i = bottom; i >= top; i--) {
                        arr[i][left]= mat[j];
                        j++;
                    }
                    left++;
                }
            }

            return arr;

        }
    }
