package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/21 22:52
 */
public class LC76 {
    public String minWindow(String s, String t) {
        Map<Character,Integer> count = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        for(int i = 0; i < t.length(); ++i){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0) + 1);
        }
        int left = 0, right = 0 ,sum = 0 ,p=0;
        int minLength = Integer.MAX_VALUE;
        while( right < s.length()){
            char c = s.charAt(right);
            right++;
            if( need.containsKey(c) ){
                count.put(c,count.getOrDefault(c,0) + 1);
                if(count.get(c).equals(need.get(c)))
                    sum++;
            }
            while( sum == need.size()){
                if( right - left < minLength){
                    p = left;
                    minLength = right - left;
                }
                char delete = s.charAt(left);
                left++;
                if(need.containsKey(delete)){
                    if(count.get(delete).equals(need.get(delete))){
                        sum--;
                    }
                    count.put(delete,count.getOrDefault(delete,0)-1);
                }
            }
        }
        if(minLength == Integer.MAX_VALUE)
            return "";
        else
            return s.substring(p,p+minLength);
    }
}
