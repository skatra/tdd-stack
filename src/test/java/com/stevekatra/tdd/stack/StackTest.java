package com.stevekatra.tdd.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }

    @Test
    public void sizeOfStackShouldBeZero() {
        assertThat("New stack should be empty",stack.size(),is(0));
    }

    @Test
    public void pushOneValueOnStack() {
        stack.push(1);
        assertThat("Size should be one after pushing one item onto the stack.", stack.size(), is(1));
    }

    @Test
    public void pushTwoValuesOnStack() {
        stack.push(1);
        stack.push(2);
        assertThat("Size should be two after pushing one item onto the stack.", stack.size(), is(2));
    }

    @Test
    public void pushOnePopOneValueOnStack() {
        stack.push(1);
        int popReturnValue = stack.pop();
        assertThat("Size should be zero after pushing and popping one item from the stack.", stack.size(), is(0));
        assertThat("1 was pushed on the stack and 1 should be returned when calling pop.", popReturnValue, is(1));
    }

    @Test
    public void pushOneAndPeek() {
        stack.push(1);
        assertThat("1 was pushed on the stack and 1 should be returned when calling peek.", stack.peek(), is(1));
    }

    @Test(expected = EmptyStackException.class)
    public void peekOnEmptyStack() {
        stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void popOnEmptyStack() {
        stack.pop();
    }

    @Test
    public void emptyStack() {
        assertThat("isEmpty method reports true for an empty stack", stack.isEmpty(), is(true));
    }

    @Test
    public void populatedStack() {
        stack.push(1);
        assertThat("isEmpty should report false if there are items on the stack", stack.isEmpty(), is(false));
    }


}
