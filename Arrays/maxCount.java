package Arrays;

public class maxCount {
    public static void main(String[] args) {
        int[] arr = {4,4,1,1,1,5,5,5};
        int n = arr.length;
        System.out.println(maxc(arr,n));
    }
    public static int maxc(int[] arr, int n){
        int max =0;
        int num=0;
        for (int i=0;i<n;i++){
            int count =0;
            for (int j=i;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;}
                    if(max<=count){
                        max = count;
                        num = arr[i];
                    }
                }
        }
        return num;

    }
}