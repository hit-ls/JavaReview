package 笔试真题;

import java.util.ArrayList;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/16 22:31
 */
public class VIVO2020_1 {
    public static void main(String[] args) {
        VIVO2020_1 a = new VIVO2020_1();
        System.out.println(a.compileSeq("1,2,-1,1"));
    }
    public String compileSeq (String input) {
        // write code here
        ArrayList<Integer> array = new ArrayList<>();
        int n = 0;
        StringBuilder res = new StringBuilder();
        for(String num : input.split(",")){
            n++;
            array.add(Integer.valueOf(num));
        }
        int[] nums = new int[n];
        for(int i = 0; i < n ; ++i)
            nums[i] = array.get(i);
        for(int i = 0; i<n;++i)
            System.out.println(nums[i]);
        int count = 0;
        for(int i = 0; i < n ; ++i){
            if(nums[i] == -1){
                res.append(i).append(",");
                count++;
            }
        }
        while( count < n ){
            for(int i = 0; i < n ; ++i){
                if(nums[i]!= -1 && nums[nums[i]]==-1){
                    res.append(i).append(",");
                    nums[i] = -1;
                    count++;
                    break;
                }
            }
        }
        String resString = new String(res);
        resString = resString.substring(0,resString.length()-1);
        return resString;
    }
}
