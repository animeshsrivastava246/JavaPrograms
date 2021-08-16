import java.util.Arrays;
public class MathsCP {
    public static void main(String[] args) {
        // boolean ISprime[] = seaiveOfEratoSthenes(100);
        // for (int i = 2; i <= 100; i++) {
        //     if(ISprime[i])
        //         System.out.println(i+" "+ISprime[i]);
        // }

        // System.out.println(GCD(27, 12));

        System.out.println(fastPower(3645656, 5,1000000007));//3645656^5 *10^9 +7
    }
    static int fastPower(int a, int b){
        int ans = 1;
        while(b>0){
            //if((b%2)!=0){
            if((b&1)!=0){
                ans *= a;
            }
            a *= a;
            /*b = b/2;*/
            b = b>>1;
        }
        return ans;
    }
    static long fastPower(int a, int b, int n){
        int ans = 1;
        while(b>0){
            //if((b%2)!=0){
            if((b&1)!=0){
                ans = (ans * a%n) % n;
            }
            a = (a%n * a%n)%n;
            /*b = b/2;*/
            b = b>>1;
        }
        return ans;
    }
    static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b); 
    }
    static boolean[] seaiveOfEratoSthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i = 2; i*i <= n; i++) {
            for (int j = 2*i; j <= n; j += i) 
                isPrime[j]=false;
        }
        return isPrime;
    }
}