package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class largestSubArray {
    public static void main(String[] args) {


        int[] arr = {10, 15, -5, 15,0,0,0,0,0,0, -10,1, 5,5,5,-5,-5,-5};
        int n = arr.length;
        int sum =0;
        System.out.println(maxLen(arr));

    }
    public static ArrayList<Integer> findsum(int[] arr,int n,int sum){
        HashMap<Integer,Integer>  map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int curSum = 0;
        int left=0;
        int right =0;
        int len =0;
        for(int i=0;i<n;i++){
        curSum = curSum+arr[i];
        if(curSum-sum==0){
            left=0;
            right =i;
            break;
        } if(map.containsKey(curSum-sum)){
            int tmp = i-(map.get(curSum-sum)+1);
            if(tmp>len) {
                len=tmp;
                left = map.get(curSum - sum) + 1;
                right = i;
//                map.put(curSum,i);
            }
            }
        map.put(curSum,i);
        }
        list.add(left);
        list.add(right);
        return list;

    }
    // Java program for the above approach
        // Returns length of the maximum length
        // subarray with 0 sum
        static int maxLen(int arr[])
        {
            // Creates an empty hashMap hM
            HashMap<Integer, Integer> hM
                    = new HashMap<Integer, Integer>();

            int sum = 0; // Initialize sum of elements
            int max_len = 0; // Initialize result

            // Traverse through the given array
            for (int i = 0; i < arr.length; i++) {
                // Add current element to sum
                sum += arr[i];

                if (sum == 0)
                    max_len = i + 1;

                // Look this sum in hash table
                Integer prev_i = hM.get(sum);

                // If this sum is seen before, then update
                // max_len if required
                if (prev_i != null)
                    max_len = Math.max(max_len, i - prev_i);
                else // Else put this sum in hash table
                    hM.put(sum, i);
            }

            return max_len;
        }

        // Drive's code

    }
