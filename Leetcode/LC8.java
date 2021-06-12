package Leetcode;

import java.util.HashMap;

public class LC8 {
    public static int myAtoi(String s) {
        char[] a = s.toCharArray();
        int p = 0;
        int n = a.length;
        int res=0,dig;
        boolean flag = false;
        long max = 2147483647L;
        while( p < n  && a[p] == ' ' ){
            ++p;
        }
        if(p==n)
            return 0;
        else if( a[p] == '-'){
            flag = true;
            max = 2147483648L;
            p++;
        }
        else if( a[p] == '+')
            p++;
        else if( !Character.isDigit(a[p]))
            return 0;
        while( p < n && Character.isDigit(a[p]) && a[p] == '0'){
            ++p;
        }
        while( p < n && Character.isDigit(a[p])){
            dig = a[p] - '0';
            if( res > (max-dig)/10 || ( res == (max-dig)/10 && (p+1) == n))
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            res = res *10 + dig;
            ++p;
        }
        if( res == 0)
            return 0;
        else
            return flag ? -res : res ;
    }
    public static void main(String[] args) {

    }
}
