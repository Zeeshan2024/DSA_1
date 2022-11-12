package Arrays;

public class findpair {
    public static void main(String[] args) {
        int[] arr ={2,4,5,8,9};
        int trg = 98;
        int i = 0;
        int j = arr.length-1;
        System.out.println(sum(arr,trg));
        System.out.println(recursion(arr,trg,i,j));
    }
    public static boolean sum(int[] arr, int trg){
        boolean result = false;
        int j = arr.length-1;
        int i = 0;
        while (i<j){
            if((arr[i]+arr[j])==trg){
                result = true;
                return result;
            }
            if((arr[i]+arr[j])>trg){
                j--;
            }else i++;
        }
        return result;
    }
    public static boolean recursion(int[] arr, int trg,int i, int j) { // using recursion
        if(i>j){
            return false;
        }
        if(arr[i]+arr[j]==trg){
            return true;
        }
        if(arr[i]+arr[j]>trg) {
           return recursion(arr, trg, i, j-1);
        }else
            return  recursion(arr,trg,i+1,j);

    }
    }
