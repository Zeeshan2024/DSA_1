package Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {3,1,4,8,7,2,5};
        int l = arr.length-1;
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] arr){
        int l = arr.length-1;
        int pr = 0;
        for(int i=0;i<l;i++){
            if(arr[i]<arr[i+1]){
                pr = pr+(arr[i+1] - arr[i]);
            }
        }
        return pr;
    }
}
