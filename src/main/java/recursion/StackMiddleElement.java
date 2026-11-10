package recursion;

import java.util.Stack;

public class StackMiddleElement {

    public static void main(String[] args) {

        // delete the middle element in the stack

        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(6);
        st.push(4);
        st.push(5);


        deleteMiddle(st, st.size());
        for (int i : st) {
            System.out.print(i + "\n");
        }
    }

    public static void deleteMiddle(Stack<Integer> st, int totalSize) {

        int n = st.size();

        //bc
        if (n == totalSize/2 +1) {
            st.pop();
            return;
        }

        //hypothesis
        int latest = st.pop();
        deleteMiddle(st, totalSize);

        //induction
        st.push(latest);
    }
}
