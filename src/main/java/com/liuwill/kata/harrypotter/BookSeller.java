package com.liuwill.kata.harrypotter;

import java.util.Map;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/17.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/17
 * @desc
 */
final class BookSeller {
    public static final double BOOK_PRICE = 8;
    public static final int TOP_AWARD_BUY_NUMBER = 5;
    public static final int SECONDARY_AWARD_BUY_NUMBER = 4;
    public static final int THIRD_AWARD_BUY_NUMBER = 3;
    public static final int LAST_AWARD_BUY_NUMBER = 2;

    static BookSeller open() {
        return new BookSeller();
    }

    double calculateDiscountByTypes(int i) {
        if (i == TOP_AWARD_BUY_NUMBER) {
            return 0.25;
        } else if (i == SECONDARY_AWARD_BUY_NUMBER) {
            return 0.2;
        } else if (i == THIRD_AWARD_BUY_NUMBER) {
            return 0.1;
        } else if (i == LAST_AWARD_BUY_NUMBER) {
            return 0.05;
        }

        return 0;
    }

    double calculatePayPriceByTypes(int i) {
        double discount = calculateDiscountByTypes(i);

        return BOOK_PRICE * (1 - discount) * i;
    }

    boolean hasMoreDiscount(int min) {
        if (min > 1) {
            return true;
        }
        return false;
    }

    DiscountGroup generateDiscountGroup(BookOrder bookOrder) {
        Map<String, BookSku> bookSkuMap = bookOrder.getOrderSkuMap();
        DiscountGroup bestDiscount = null;

        int target = 5;
        while (hasMoreDiscount(target)) {

            target++;
        }
        return bestDiscount;
    }

    static BookOrder generateHarryPotterBookOrder(int first, int second, int third, int forth, int fifth) {
        BookOrder bookOrder = new BookOrder();
        bookOrder.putSku(new BookSku("first", first));
        bookOrder.putSku(new BookSku("second", second));
        bookOrder.putSku(new BookSku("third", third));
        bookOrder.putSku(new BookSku("forth", forth));
        bookOrder.putSku(new BookSku("fifth", fifth));
        return bookOrder;
    }
}
