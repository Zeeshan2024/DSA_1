package Recursion;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int tar = 3;
        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr,start,end,tar));
    }
    static int search(int[] arr, int s,int e, int tar){
        if(s>e){
            return -1;
        }
        int m = s +(e-s)/2;
        if(tar==arr[m]){
            return m;
        }
        if(tar>arr[m]){
          return   search(arr,m+1,e,tar);
        }else
            return search(arr,s,m-1,tar);
    }
}
