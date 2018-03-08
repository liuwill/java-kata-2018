package com.liuwill.kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
                assertEquals(new Integer(i).toString(), answer);
            }
        }
        System.out.println("just test");
    }

}
