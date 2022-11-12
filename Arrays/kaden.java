package Arrays;

public class kaden {
    public static void main(String[] args) {
        int[] arr = {-10,-2,-3,-4,5,4,-2};
        System.out.println(find(arr));
    }
    public static int find(int[] arr ){
        int max = Integer.MIN_VALUE;
        int cur = 0;

        for(int i=0;i<arr.length;i++){
            cur = cur+arr[i];
            if(cur>max){
                max=cur;
            }
            if (cur<0){
                cur = 0;
            }
        }
        return max;
    }
}
