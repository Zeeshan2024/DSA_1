package Arrays;

public class waterlevel {
    public static void main(String[] args) {
        int[] arr = {9,6,6,7,3};
        System.out.println(maxcontain(arr));
    }
    public static int maxcontain(int[] arr){
        int i=0;
        int j=arr.length-1;
        int tmp=0;
        while (i<j){
            if(arr[i]<=arr[j]){
                if(tmp<(j-i)*arr[i])
                tmp = (j-i)*arr[i];
                i++;
            }else {
                if(tmp<(j-i)*arr[j])
                tmp =(j-i)*arr[j];

                j--;

            }
        } return tmp;
    }
}
