package Recursion;

import java.util.Stack;

public class sorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int ind=0;
        System.out.println(check(ind,arr));
    }
    static boolean check(int ind, int[] arr){
        if(ind==arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && check(ind+1,arr);
    }
}
