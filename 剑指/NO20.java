package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/14 16:47
 */
public class NO20 {
    /**
     * 剑指offer20题，合理使用flag
     * @param
     * @return boolean
     * @create 2021/6/14 17:36
     */
    public boolean isNumber(String s) {
        if( s == null )
            return false;
        s = s.trim();
        char[] a = s.toCharArray();
        int index = 0 , n = s.length();
        boolean numTail = false;
        boolean pointFlag = false;
        boolean eFlag = false;
        for( ; index < n ; ++index){
            if(isDigit(a[index]))
                numTail = true;
            else if( a[index] == '.' && !pointFlag && !eFlag)
                pointFlag = true;
            else if( (a[index] == 'e' || a[index] == 'E') && numTail && !eFlag ){
                numTail = false;
                eFlag =true;
            }
            else if( (a[index] == '+' || a[index] == '-') && ( index == 0 || a[index-1] == 'e' || a[index-1] == 'E')){

            }
            else
                return false;
        }
        return numTail;
    }
    public boolean isDigit(char a){
        if( a >= '0' && a <= '9')
            return true;
        return false;
    }
}
