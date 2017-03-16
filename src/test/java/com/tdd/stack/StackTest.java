package com.tdd.stack;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class StackTest {
    @Test
    public void CreateStack() throws Exception {
        Stack stack = new Stack();
        assertNotNull("Stack should not be null", stack);
    }
}
