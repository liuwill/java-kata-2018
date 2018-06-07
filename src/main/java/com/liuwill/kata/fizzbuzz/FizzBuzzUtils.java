package com.liuwill.kata.fizzbuzz;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/8.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/8
 * @desc
 */
class FizzBuzzUtils {
    private final static int RANDOM_VALIDATE_TIMES = 20;

    static boolean isFizz(Integer i) {
        return i % 3 == 0;
    }

    static boolean isBuzz(Integer i) {
        return i % 5 == 0;
    }

    static boolean isFizzBuzz(Integer i) {
        return isFizz(i) && isBuzz(i);
    }

    static boolean verifyTranslator(FizzBuzzTranslator translator) {
        for (int i = 0; i < RANDOM_VALIDATE_TIMES; i++) {
            String answer = translator.answer(i);
            if (!isRightAnswer(i, answer)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isRightAnswer (Integer question, String answer) {
        if (isFizzBuzzAnswer(question, answer)) {
            return true;
        } else if (isFizzAnswer(question, answer)) {
            return true;
        } else if (isBuzzAnswer(question, answer)) {
            return true;
        }

        return isPlainAnswer(question, answer);

    }

    private static boolean isFizzBuzzAnswer (Integer question, String answer) {
        return isFizzBuzz(question) && "fizzbuzz".equals(answer);
    }

    private static boolean isFizzAnswer (Integer question, String answer) {
        return isFizz(question) && "fizz".equals(answer);
    }

    private static boolean isBuzzAnswer (Integer question, String answer) {
        return isBuzz(question) && "buzz".equals(answer);
    }

    private static boolean isPlainAnswer (Integer question, String answer) {
        return !(isFizzBuzz(question) || isFizz(question) || isBuzz(question)) && Integer.toString(question).equals(answer);
    }
}
