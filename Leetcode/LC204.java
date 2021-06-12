package Leetcode;

public class LC204 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
            System.out.println(countPrimes(i));
    }
    public static int countPrimes(int n) {
        if(n==0 || n==1 || n==2)
            return 0;
        int i,num=n-2;
        for(i=2;i<n;i++){
            if(!isPrime(i))
                num--;
        }
        return num;
    }
    public static boolean isPrime(int x){
        int i;
        for(i=2;i*i<=x;++i){
            if( x%i==0 )
                return false;
        }
        return true;
    }
}
