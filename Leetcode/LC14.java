package Leetcode;

public class LC14 {
    public static void main(String[] args) {
        String[] test = {"flower","flow","flight"};
        String a = longestCommonPrefix(test);
        System.out.println(a);
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0)
            return "";
        int nums = strs.length;
        String temp=strs[0];
        for(int i=0;i<nums;++i){
            temp=longestCommon(temp,strs[i]);
            if(temp.length()==0)
                return "";
        }
        return temp;
    }
    public static String longestCommon(String a ,String b){
        int index=0;
        int maxLength = Math.min(a.length(),b.length());
        while(index<maxLength && a.charAt(index)==b.charAt(index)){
            ++index;
        }
        return a.substring(0,index);
    }
}
