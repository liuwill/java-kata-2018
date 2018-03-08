package com.liuwill.kata.fizzbuzz;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/8.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/8
 * @desc
 */
public class FizzBuzzUtils {
    public static boolean isFizz(Integer i) {
        return i % 3 == 0;
    }

    public static boolean isBuzz(Integer i) {
        return i % 5 == 0;
    }

    public static boolean isFizzBuzz(Integer i) {
        return isFizz(i) && isBuzz(i);
    }
}
