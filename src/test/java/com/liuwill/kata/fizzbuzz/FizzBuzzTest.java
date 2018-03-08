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
        String answer = BasicFizzBuzz.answer(1);
        String answerFizz = BasicFizzBuzz.answer(3);
        String answerBuzz = BasicFizzBuzz.answer(5);
        String answerFizzBuzz = BasicFizzBuzz.answer(15);

        assertEquals("1", answer);
        assertEquals("fizz", answerFizz);
        assertEquals("buzz", answerBuzz);
        assertEquals("fizzbuzz", answerFizzBuzz);
        System.out.println("just test");
    }

}
