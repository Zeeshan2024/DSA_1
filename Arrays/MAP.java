package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MAP {
    public static void main(String[] args) {
        int[]  arr = {5,4,2,7,3,1};
        int trg = 12;
        int[] result = find(arr,trg);
        System.out.println(Arrays.toString(result));
    }
    public static int[] find(int[] arr,int trg){
        int[] points = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(trg-arr[i])){
                points[0]=map.get(trg-arr[i]);
                points[1]=i;
            }else map.put(arr[i],i);
        }
        return points;
    }

}
