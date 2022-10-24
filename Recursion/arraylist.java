package Recursion;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7};
        int trg = 4;
        int inde = 0;
        System.out.println(search(arr,trg,inde));
    }
    static ArrayList search(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
             return list;
        }
        if(arr[index]==target){
            list.add(index);
        } ArrayList<Integer> ansofcall = search(arr,target,index+1);
        list.addAll(ansofcall);
        return list;
    }
}
