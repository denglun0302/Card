import java.util.ArrayList;
import java.util.Stack;
public class MyQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    public void push(int x) {
        in.add(x);
    }
    public int pop() {
        int size = in.size();
        for (int i = 0; i < size - 1; i++) {
            int h = in.pop();
            out.add(h);
        }
        return out.pop();
    }

        public int peek() {
            int size = in.size();
            for (int i = 0; i < size - 1; i++) {
                int h = in.pop();
                out.add(h);

            }
            return out.peek();

        }
        public boolean empty() {
            return out.empty() && in.empty();

        }
    }


