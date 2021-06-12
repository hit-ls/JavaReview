package Leetcode;

public class LC28 {
    public static void main(String[] args) {
        System.out.println(strStr("bbba","a"));
    }
    public static int strStr(String haystack,String needle){
        int maxStart = haystack.length()-needle.length();
        if(needle.length()==0 || needle==null || haystack==null){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<=maxStart;++i){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
