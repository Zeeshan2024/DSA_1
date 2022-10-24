package Heapify;

import java.util.ArrayList;
import java.util.Arrays;

public class Buildheap {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int[] sarr = {23,45,65};
//        int tmp = sarr[0];
//         sarr[0] = sarr[1];
//         sarr[1] = tmp;
         swap(sarr,2,1);
        System.out.println(Arrays.toString(sarr));
    }
    static void swap(int[] sarr, int a, int b){
        int tmp = sarr[a];
        sarr[a] = sarr[b];
        sarr[b] = tmp;
    }
}
