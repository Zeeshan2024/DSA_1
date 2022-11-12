package Arrays;

import java.util.Arrays;

public class countigiou {
    public static void main(String[] args) {
        int[] arr = {-5,4,6,-3,4,-1};
        System.out.println(findSum(arr));
    }
    public static int findSum(int[] arr){
        int n= arr.length;
        int[] ind = new int[2];
        int max_sum = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum = arr[j]+sum;
                if(max_sum<sum){
                    max_sum = sum;
                    ind[0] = i;
                    ind[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(ind));
        return max_sum;
    }
}
