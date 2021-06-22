package 剑指;

import java.util.Stack;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/16 15:08
 */
public class NO31 {
    /**
     * 自行模拟
     * @param pushed
     * @param popped
     * @return boolean
     * @create 2021/6/16 15:15
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for( int num : pushed){
            stack.push(num);
            while( !stack.isEmpty() && stack.peek().equals(popped[index])){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
