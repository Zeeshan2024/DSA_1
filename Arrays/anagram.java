package Arrays;

import com.sun.source.tree.BreakTree;

public class anagram {
    public static void main(String[] args) {
        String str = "baac";
        String st1 = "abca";
        System.out.println(repeat(str,st1));
    }
    public static boolean repeat(String str, String st1){
        boolean isAnagram=false;
        boolean[] visit = new boolean[st1.length()];
        if(str.length()!=st1.length()){

            return isAnagram;
        }
        for(int i=0;i<str.length();i++){
            isAnagram = false;
            char c = str.charAt(i);
            for (int j=0;j<st1.length();j++){
                if(st1.charAt(j)==c && !visit[j]){
                    visit[j]=true;
                   isAnagram = true;
                   break;
                }
            }
            if(!isAnagram){
                break;
            }
        }


        return isAnagram;
    }
}
