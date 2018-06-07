package com.liuwill.kata.fizzbuzz;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/8.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/8
 * @desc
 */
public class BasicFizzBuzz implements FizzBuzzTranslator{

    @Override
    public String answer(Integer i) {
        StringBuilder result = new StringBuilder();
        if (FizzBuzzUtils.isFizz(i)) {
            result.append("fizz");
        }
        if (FizzBuzzUtils.isBuzz(i)) {
            result.append("buzz");
        }

        if (result.length() < 1) {
            result.append(i);
        }
        return result.toString();
    }
}
