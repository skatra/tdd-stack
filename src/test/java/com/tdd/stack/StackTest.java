package com.tdd.stack;

import org.junit.Test;

import java.util.EmptyStackException;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void CreateStack() throws Exception {
        Stack stack = new Stack();
        assertNotNull("Stack should not be null", stack);
    }

    @Test
    public void CheckStackSize() throws Exception {
        Stack stack = new Stack();
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test
    public void CreateStackWithInitialCapacity() throws Exception {
        Stack stack = new Stack(1);
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test
    public void PushIntOnStack() throws Exception {
        Stack stack = new Stack(1);
        stack.push(1);
        assertTrue("Stack should be size 1",stack.size() == 1);
    }

    @Test
    public void PopIntOffStack() throws Exception {
        Stack stack = new Stack(1);
        stack.push(1);
        assertTrue("Value popped from Stack should be 1",stack.pop() == 1);
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test
    public void PushTwoPopTwo() throws Exception {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        assertTrue("Stack should be size 2",stack.size() == 2);
        assertTrue("Value popped from Stack should be 2",stack.pop() == 2);
        assertTrue("Value popped from Stack should be 1",stack.pop() == 1);
        assertTrue("Stack should be size 0",stack.size() == 0);
    }

    @Test(expected = UnderflowException.class)
    public void PopFromEmptyStack() throws Exception {
        Stack stack = new Stack(1);
        stack.pop();
    }

    @Test(expected = OverflowException.class)
    public void PushTwoWhenCapacityIsOne() throws Exception {
        Stack stack = new Stack(1);
        stack.push(1);
        stack.push(2);
    }

    @Test
    public void PushOnePeek() throws Exception {
        Stack stack = new Stack(2);
        stack.push(1);
        assertTrue("Peek should be 1", stack.peek() == 1);
        assertTrue("Stack should be size 1",stack.size() == 1);
    }

    @Test
    public void PushTwoPeek() throws Exception {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        assertTrue("Peek should be 2", stack.peek() == 2);
        assertTrue("Stack should be size 2",stack.size() == 2);
    }

    @Test(expected = EmptyStackException.class)
    public void PeekFromEmptyStack() throws Exception {
        Stack stack = new Stack(1);
        stack.peek();
    }
}
