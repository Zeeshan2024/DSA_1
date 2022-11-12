package Arrays;
import java.lang.*;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 2, 5, 7, 5};
        System.out.println(sum(arr));
    } // TODO: BruteForce TC = O(NxNxN);
    public static int sum(int[] arr){
        int s = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for (int j=(i+1);j<n;j++){
                for(int k=(j+1);k<n;k++){
                    if(arr[i]<arr[j] && arr[j]<arr[k]){
                        if(s<(arr[i]+arr[j]+arr[k])){
                        s = arr[i]+arr[j]+arr[k];
                        }
                    }
                }
            }
        }
        return s;
    }


//    public static int fixSum(int[] arr){
//
//    }
}
