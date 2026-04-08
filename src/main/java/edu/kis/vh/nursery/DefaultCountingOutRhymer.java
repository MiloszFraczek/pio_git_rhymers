package edu.kis.vh.nursery;



public class DefaultCountingOutRhymer {

    private final int CAPACITY =12;
    private final int EMPTY_STACK =-1;
    private final int MAX_INDEX = CAPACITY -1;
    private final int ERROR = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
