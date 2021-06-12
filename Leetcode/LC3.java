package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, n = s.length();
        int rp = -1;
        for(int lp=0;lp<n;++lp){
            if(lp!=0){
                set.remove(s.charAt(lp-1));
            }
            while( (rp+1<n) && !set.contains(s.charAt(rp+1)) ){
                ++rp;
                set.add(s.charAt(rp));
            }
            if(rp-lp+1>res)
                res = rp-lp+1;
        }
        return res;
    }
}
