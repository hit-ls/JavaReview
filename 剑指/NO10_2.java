package 剑指;

public class NO10_2 {
    public int numWays(int n){
        int a = 1 , b = 1,sum;
        for(int i = 0;i<n;++i){
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
