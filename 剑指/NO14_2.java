package 剑指;

public class NO14_2 {
    public int cuttingRope(int n) {
        if(n<=3)
            return  n-1;
        int m =(int)1e9+7;
        long res = 1L;
        while(n>4){
            res = res*3%m;
            n-=3;
        }
        res = res*n%m;
        return (int)res;
    }
}
