package Arrays;

import java.util.Arrays;

public class anagramon {
    public static void main(String[] args) {


        String str = "abbad";
        String sr1 = "bbaad";
        System.out.println(isanagram(str,sr1));
    }
    public static boolean isanagram(String str, String str1){
        if(str.length()!=str1.length()){
            return false;
        }

        int[] count = new int[256];
        Arrays.fill(count,0);

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]=count[str.charAt(i)]+1;
        }
        for (int j=0;j<str1.length();j++){
            count[str1.charAt(j)]--;
        }
        for(int x:count){
            if(x!=0)
                return false;
        }
        return true;
    }
}