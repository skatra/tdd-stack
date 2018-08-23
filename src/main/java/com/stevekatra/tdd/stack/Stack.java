package com.stevekatra.tdd.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> stack = new ArrayList<Integer>();

    public int size() {
        return stack.size();
    }

    public void push(int i) {
        stack.add(i);
    }

    public int pop() {
        validateStackIsNotEmpty();
        return stack.remove(stack.size()-1);
    }

    private void validateStackIsNotEmpty() {
        if (stack.size() == 0)
            throw new EmptyStackException();
    }

    public int peek() {
        validateStackIsNotEmpty();
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
