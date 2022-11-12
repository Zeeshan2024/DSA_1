package Arrays;

import java.util.Arrays;
import java.util.SortedMap;

import static java.util.Collections.indexOfSubList;
import static java.util.Collections.swap;

public class Rotate {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
        };
        transpose(arr);
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
     public static int[][] rotateImage(int[][] arr){

        int row = arr.length-1;
        int col = arr.length-1;
        int[][] mat = new int[row+1][col+1];

        for (int i=0;i<=row;i++){
            int k =0;
            for(int j=col;j>=0;j--){
                int tmp = arr[i][k];
                arr[i][k] = arr[j][i];
                arr[j][i] = tmp;
//               swap(arr[i][k], arr[j][i],arr);
               k++;
            }
        }

        return arr;
    }

    private static void transpose(int[][] arr){
        int row = arr.length-1;
        int col = arr.length-1;
        for(int i=0;i<=row;i++){
            for(int j=0;j<=i;j++){
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
            for(int a=0;a<=row;a++){
                int g =2;
                for(int b=0;b<1;b++){
                    int tmp = arr[a][b];
                    arr[a][b] = arr[a][g];
                    arr[a][g] = tmp;
                }
            }
        }
    }

