package recursion;

import java.util.Stack;

public class SortingStack {

    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
//    (List.of(2, 3, 7, 6, 4, 5));
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(6);
        st.push(4);
        st.push(5);

        // sorting using recursion
        sortingUsingRecursion(st);
        for (int i : st) {
            System.out.print(i + "\n");
        }

    }

    public static void sortingUsingRecursion(Stack<Integer> st) {

        // bc
        if (st.isEmpty()) {
            return;
        }

        // hypothesis
        int lastElement = st.pop();
        sortingUsingRecursion(st);

        // induction
        insert(st, lastElement);

    }

    public static void insert(Stack<Integer> st, int lastElement) {

        // bc
        if (st.isEmpty() || st.peek() < lastElement) {
            st.push(lastElement);
            return;
        }

        // hypothesis
        int top = st.pop();
        insert(st, lastElement);

        // induction
        st.push(top);

    }
}
