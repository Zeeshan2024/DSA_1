package Arrays;

import java.util.Arrays;

public class minPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int l = arr.length;
        int result=0;
        Arrays.sort(arr);
        for(int i=1;i<=l+1;i++){
                if(bpresent(i,arr)){
                    continue;
                }else result=i;
                break;
                }

        return result;
    }
    // Linear Search Approach ---- it take too much time
    static boolean present(int n,int[] arr){
        boolean b = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                b=true;
            }
        }
        return b;
    }
    // Binary Search Approach
    static boolean bpresent(int n,int[] arr){
        boolean b = false;
        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]==n){
                b=true;
                return b;
            }
            if(arr[mid]>n){
                e = mid-1;
            }else s=mid+1;
        }
        return b;
    }
}
