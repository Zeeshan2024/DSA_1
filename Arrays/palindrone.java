package Arrays;

import java.util.Arrays;

public class palindrone {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(check(str));
    }
    public static boolean check(String str){
        int[] count = new int[256];
        Arrays.fill(count,0);
        for (int i=0;i<str.length();i++){
           count[str.charAt(i)]++;
        }
        int odd=0;
        for(int i=0;i<256;i++){
            if(count[i]%2==1){
                odd++;
        } if(odd>1){
               return false;
            }
    }
        return true;
}
}
