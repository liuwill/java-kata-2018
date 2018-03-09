package com.liuwill.kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fast")
class FizzBuzzTest {

    @Test
    @DisplayName("fizz buzz and 😎")
    void testBasic() {
        FizzBuzzTranslator basicTranslator = new BasicFizzBuzz();
        for (int i = 0; i < 20; i++) {
            String answer = basicTranslator.answer(i);
            if (FizzBuzzUtils.isFizzBuzz(i)) {
                assertEquals("fizzbuzz", answer);
            } else if (FizzBuzzUtils.isFizz(i)) {
                assertEquals("fizz", answer);
            } else if (FizzBuzzUtils.isBuzz(i)) {
                assertEquals("buzz", answer);
            } else {
                assertEquals(Integer.toString(i), answer);
            }
        }

        System.out.println("just test");
    }

    @Test
    @DisplayName("we should check utils")
    void testUtils () {
        assertTrue(FizzBuzzUtils.isFizz(0));
        assertTrue(FizzBuzzUtils.isBuzz(0));
        assertTrue(FizzBuzzUtils.isFizzBuzz(0));
    }

    @Test
    @DisplayName("translator could be verified")
    void testTranslator() {
        FizzBuzzTranslator basicTranslator = new BasicFizzBuzz();
        assertTrue(FizzBuzzUtils.verifyTranslator(basicTranslator));
    }
}
