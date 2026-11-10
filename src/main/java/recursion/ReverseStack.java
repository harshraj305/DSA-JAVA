package recursion;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        // reverse the stack

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

//        List<Integer> arr = new ArrayList<>();
//        reverseStack(st, arr);

        reverseStack(st);
        for (int i : st) {
            System.out.println(i);
        }
    }

    static void reverseStack(Stack<Integer> st) {
        // bc
        if (st.isEmpty()) return;
        // hypo
        int element = st.pop();
        reverseStack(st);
        // ind
        fitTheTop(st, element);
    }

    static void fitTheTop(Stack<Integer> st, int element) {
        // bc
        if (st.empty()) {
            st.push(element);
            return;
        }
        // hypo
        int latest = st.pop();
        fitTheTop(st, element);
        // ind
        st.push(latest);

    }


    /*
    public static void reverseStack(Stack<Integer> st, List<Integer> arr) {

        //bc
        if (st.isEmpty()) return;

        //hypothesis
        arr.add(st.pop());
        reverseStack(st, arr);

        //induction
        st.push(arr.get(st.size()));
    }
    */
}
