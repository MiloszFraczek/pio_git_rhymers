package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        final int START =1;
        final int END =1;
        final int IDX =3;
        final int NEXT =20;
        final String TOTAL = "total rejected is ";
        RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory, START, END, IDX, NEXT, TOTAL);

    }

    private static void testRhymers(RhymersFactory factory, int START, int END, int IDX, int NEXT, String TOTAL) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = START; i < END; i++)
            for (int j = 0; j < IDX; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = START; i < END; i++)
            rhymers[IDX].countIn(rn.nextInt(NEXT));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println(TOTAL
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }
    //Wszystkie testy przechodza, projekt jest poprawny
}