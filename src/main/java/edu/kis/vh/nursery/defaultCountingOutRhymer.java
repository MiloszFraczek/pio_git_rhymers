package edu.kis.vh.nursery;



public class defaultCountingOutRhymer {

    private final int NUM =12;
    private final int CALL_TOTAL =-1;
    private final int FULL_TOTAL =11;
    private final int ERROR = -1;

    private int[] NUMBERS = new int[NUM];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CALL_TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[total--];
    }

}
