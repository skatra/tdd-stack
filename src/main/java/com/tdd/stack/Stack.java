package com.tdd.stack;

import java.util.EmptyStackException;

public class Stack {

    int numStored = 0;
    int[] storage;

    public Stack(int i) {
        storage = new int[i];
    }

    public Stack() {

    }

    public int size() {
        return numStored;
    }

    public void push(int i) {
        if(storage.length == numStored)
            throw new OverflowException();

        storage[numStored++] = i;
    }

    public int pop() {
        if(numStored == 0)
            throw new UnderflowException();

        return storage[--numStored];
    }

    public int peek() {
        if(numStored -1 < 0)
            throw new EmptyStackException();

        return storage[numStored - 1];
    }
}
