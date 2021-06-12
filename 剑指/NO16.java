package 剑指;

public class NO16 {
    public static void main(String[] args) {
        NO16 a = new NO16();
        System.out.println(a.myPow(2.00000,10));
    }
    public double myPow(double x, int n) {
        if( x == 1 )
            return 1;
        if( x == 0 || ( n == Integer.MIN_VALUE && (x>1 || x<-1)))
        return 0;
        double res;
        long a = n;
        if(n<0){
            x = 1 / x;
            a = -n;
        }
        res = 1;
        while(a>0){
            if( (a & 1) == 1)
                res *= x;
            x *= x;
            a>>=1;
        }
        return res;
    }
}
