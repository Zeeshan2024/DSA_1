package Arrays;

import java.util.HashSet;
import java.util.Set;

public class zeroSum {
    public static void main(String[] args) {
        int[] arr = {5,3,-3,8};
        System.out.println(find(arr));
    }
    public static boolean find(int[] arr){
        Set<Integer> hash = new HashSet<>();
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            if ( arr[i] == 0||sum==0||hash.contains(sum)){
                return true;
            }
            hash.add(sum);
        }return false;
    }
}
