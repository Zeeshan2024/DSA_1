package Arrays;

import java.util.Arrays;

// TODO time complexity of this code is O(n)
public class missingpositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
//        int[] result = find(arr);
        System.out.println(firstMissingPositive(arr));
    } public static int firstMissingPositive(int[] arr){
        int[] dummy = new int[arr.length];
        Arrays.fill(dummy,0);

        for (int val:arr) {
            if(val>0 && val<arr.length){
            dummy[val] = 1;
        }}
        int result = 0;
        for(int i=1;i<dummy.length;i++){
            if(dummy[i]!=1)
                return i;
        }
        return arr.length+1;
    }
}
