package org.example.oop.generic.genericWildcards.case2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

}

class TestCase {
    @Test
    public void createNaturalNumber_thenTrue() {
        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(100);
        System.out.println("naturalNumber.isEven() = " + naturalNumber.isEven());
        Assertions.assertTrue(naturalNumber.isEven());
    }

    @Test
    public void createNaturalNumber_thenFalse() {
        NaturalNumber<Integer> naturalNumber2 = new NaturalNumber<>(101);
        System.out.println("naturalNumber2.isEven() = " + naturalNumber2.isEven());
        Assertions.assertFalse(naturalNumber2.isEven());
    }
}
