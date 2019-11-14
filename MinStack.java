package MinStack;

import java.util.Stack;

public class MinStack {
    //A栈保存正常栈中的数据
    //B栈保存每一层A栈帧对应的最小值
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public void push(int x) {
        //先把元素插入A栈中
        A.push(x);

        //将最小值插入B栈中
        if(B.isEmpty()) {
            B.push(x);
            return;
        }
        int min = B.peek();
        if(x < min){
           min = x;
        }
        B.push(min);
    }

    public void pop() {
        if(A.isEmpty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }
}
