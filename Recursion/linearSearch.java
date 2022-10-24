package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        int index = 0;
        int tar = 8;
        System.out.println(search(arr,index,tar));
    }
    static boolean search(int[] arr, int index,int target){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        } return search(arr,index+1,target);
    }
}
