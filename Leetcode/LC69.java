package Leetcode;

public class LC69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    public static int mySqrt(int x){
        if(x==0 || x==1){
            return x;
        }
        int left=0,right=x,mid=0;
        while(right-left>1){
            mid=(left+right)/2;
            if( x/mid >= mid){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}
