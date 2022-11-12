package Arrays;
//Reverse a string word by word
public class reverewords {
    public static void main(String[] args) {
        String str = "    ";
        String s = "    ";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String result="";
        int n = str.length();
        int i =0;
        while (i<n) {
            while (i < n && str.charAt(i) == ' ') i++;

            if (i >= n) break;
            int j =i;
            while (j<n && str.charAt(j)!=' ') j++;

            String sub = str.substring(i,j);
            if(result.length()==0){
                result = sub;
            }else result = sub+" "+result;
            i =j+1;
        }
        return result;
    }

}
