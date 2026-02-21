package com.vsai.topics.stacks;

import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        // Using inbuilt Stack class from List Interface (Collection Framework)
        Stack<Integer> st = new Stack<>();

        // common operations -> push(x), pop(), top(), size(), isEmpty()
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(1);

        // top() -> peek()
        System.out.println("Top value is: " + st.peek());
        System.out.println(st);
    }
}
