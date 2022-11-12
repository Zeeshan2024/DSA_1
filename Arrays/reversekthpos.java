package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class reversekthpos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k=2;
        reverse(arr,9);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr,int k) {
        k =k% arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;

        } for(int m=0;m<k/2;m++){
            int tmp = arr[m];
            arr[m] = arr[k-m-1];
            arr[k-m-1] = tmp;
        }
        int n =0;
        for(int j=k;j<(arr.length+k)/2;j++){
            int tmp = arr[j];
            arr[j] = arr[arr.length-n-1];
            arr[arr.length-n-1] = tmp;
            n++;
        }
    }
}