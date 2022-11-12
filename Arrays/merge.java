package Arrays;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {2,5,6};
        int[] result = sum(arr,arr1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sum(int[] arr, int[] arr1){
        int[] sort = new int[arr.length+arr1.length];
        int i;
        for(i=0;i<arr.length;i++){
            sort[i] = arr[i];
        }
        for (int x:arr1) {
            sort[i]=x;
            i++;
        }
        int s =0;
        int e=arr.length;
        while(s<e && e<sort.length && s<arr.length){
          if(sort[s]<=sort[e]) s++;

            if(sort[s]>sort[e]){
                int tmp = sort[s];
                sort[s] = sort[e];
                sort[e] = tmp;
               e++;
            }

        }
        return sort;
    }

}