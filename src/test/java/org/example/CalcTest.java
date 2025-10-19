package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
<<<<<<< HEAD
    Calc c = new Calc();

    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4,2));
=======
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
>>>>>>> 2b97998fa25826d7ebda2d6ee076fddaa4c52504
    }

}
