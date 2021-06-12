package Leetcode;

public class LC29 {
    public static int divide(int dividend, int divisor) {
        int res=0;
        boolean  flag = true;
        if(dividend == 0)
            return 0;
        if(divisor == -1){
            if(dividend > Integer.MIN_VALUE)    return -dividend;
            return Integer.MAX_VALUE;
        }
        if(divisor == 1)
            return dividend;
        if( dividend < 0)
            flag = !flag;
        if( divisor < 0)
            flag = !flag;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        res = div(a,b);
        return flag ? res : -res;
    }
    public static int div(long a , long b){
        if( a < b )     return 0;
        long sum =b;
        int count = 1;
        while(a>=sum){
            sum <<= 1;
            count <<= 1;
        }
        sum >>>= 1;
        count >>>= 1;
        return div(a-sum,b)+count;
    }
    public static void main(String[] args) {
        int a = -2147483648,b=2;
        System.out.println(divide(a,b));
    }
}
