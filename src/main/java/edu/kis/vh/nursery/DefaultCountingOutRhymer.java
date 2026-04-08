package edu.kis.vh.nursery;


/**
 * Klasa reprezentuje domyslna strukture stosu.
 * Pozwala na dodawanie usuwanie i sprawdzanie elementow
 */
public class DefaultCountingOutRhymer {

    private final int CAPACITY =12;
    private final int EMPTY_STACK =-1;
    private final int MAX_INDEX = CAPACITY -1;
    private final int ERROR = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = -1;

    /**
     * dodaje nowy element na stos
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * sprawdza czy stos jest pusty
     * @return
     */
    public boolean callCheck() {
        return total == EMPTY_STACK;
    }

    /**
     * sprawdza czy stos jest pelny
     * @return
     */
    public boolean isFull() {
        return total == MAX_INDEX;
    }

    /**
     * zwraca ostatnio dodany elemnt
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     * usuwa i zwraca ostatnio dodany element
     * @return
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
