package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int[] arr1 = {1,2,3};
//        int[] result = count(arr,arr1);
        String s = "aabba";
        String t = "bbaaa";

        System.out.println(count(s,t));
    }
    public static boolean count(String s,String t){
        HashMap<Character,Integer> countmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(countmap.containsKey(s.charAt(i))){
                int cnt = countmap.get(s.charAt(i));
                cnt++;
                countmap.put(s.charAt(i),cnt);
            } else countmap.put(s.charAt(i),1);
        }
        for(int j=0;j<t.length();j++){
            if(countmap.containsKey(t.charAt(j))){
                if(countmap.get(t.charAt(j))==1){
                    countmap.remove(t.charAt(j));
                } else {
                    int val = countmap.get(t.charAt(j));
                    countmap.put(t.charAt(j),val-1);
                }
            }
        }
        return countmap.isEmpty();
    }
    }