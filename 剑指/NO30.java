package 剑指;

import java.util.Stack;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/15 23:11
 */
public class NO30 {
    Stack<Integer> A,B;
    public NO30() {
        A = new Stack<>();
        B = new Stack<>();
    }
    /**
     * 注意用equals而不是==
     * @param x
     * @return void
     * @create 2021/6/15 23:25
     */
    public void push(int x) {
        A.push(x);
        if(B.empty() || B.peek() >= x)
            B.push(x);
    }

    public void pop() {
        if(A.pop().equals(B.peek()))
            B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
