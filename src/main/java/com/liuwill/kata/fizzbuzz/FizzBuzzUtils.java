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
        for (int i = 0; i < 20; i++) {
            String answer = translator.answer(i);
            if (isFizzBuzz(i)) {
                if (!"fizzbuzz".equals(answer)) {
                    return false;
                }
            } else if (isFizz(i)) {
                if (!"fizz".equals(answer)){
                    return false;
                }
            } else if (isBuzz(i)) {
                if (!"buzz".equals(answer)){
                    return false;
                }
            } else if (!Integer.toString(i).equals(answer)) {
                return false;
            }
        }

        return true;
    }
}
