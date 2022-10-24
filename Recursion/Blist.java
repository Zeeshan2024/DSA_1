package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Blist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int trg = 4;
        int ind = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr,trg,ind,list));
    }
    static ArrayList search(int[] arr, int tar, int ind, ArrayList list){
        if(ind==arr.length){
            return list;
        }if(arr[ind]==tar){
            list.add(ind);
        }return search(arr,tar,ind+1,list);

    }
}
