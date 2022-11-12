package Arrays;

public class fastPower {
    public static void main(String[] args) {
        System.out.println(power(2,3,1000000007));


    }
    static long power(long a,long b, int n){
        long res =1;

        while(b>0){
            if((b&1)!=0){
            res = (res*a%n)%n;}

        a = (a%n*a%n)%n;
        b = b>>1;
        }
        return res;
    }
}
