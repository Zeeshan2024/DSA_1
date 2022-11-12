package Arrays;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class rough {
    public static void main(String[] args) {
        int[] arr = {2,3,1,-4,0,6,9,0,0,0,0,-9,0};
        int n = arr.length;
//        ArrayList<Integer> res = largestSubarraySumZero(n,arr);
//
//        for (int j : res)
//            System.out.print(j + " ");

        System.out.println(getMaxile(arr,n));

    }
    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int right =0;
        int val =0;
        int left =0;
        int lenth =0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum==0||map.containsKey(sum)){
                if(map.get(sum)!=null){
              int tmp = map.get(sum);
              if((i-tmp)>lenth){
                  lenth=(i-tmp);
                val = sum;
                right = i;}

            }                map.put(sum,i);
            }else
                map.put(sum,i);
        }

         left = map.get(val);
        for(int j=left+1;j<=right;j++){
            list.add(arr[j]);
        }


        return list;

    }
   public static int getMaxile(int[] A,int n) {
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
       int maxi = 0;
       int sum = 0;
       int val =0;
       for (int i = 0; i < n; i++) {
           sum += A[i];

           if (sum == 0) {
               maxi = i + 1;
           } else {
               if (mpp.get(sum) != null) {
                   maxi = Math.max(maxi, i - mpp.get(sum));
                   val = sum;
               } else {

                   mpp.put(sum, i);
               }
           }
//       } int left= mpp.get(val);
//       for(int j=left+1;j<maxi;j++){
//           list.add(A[j]);
//       }
       }
       return maxi;
   }
}
