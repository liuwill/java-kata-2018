package com.liuwill.kata.harry_potter;

import java.math.BigDecimal;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/17.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/17
 * @desc
 */
class BookSeller {
    public static  final double BOOK_PRICE = 8;

    static BookSeller open() {
        return new BookSeller();
    }

    double calculateDiscountByTypes(int i) {
        if (i == 5) {
            return 0.25;
        } else if (i == 4) {
            return 0.2;
        } else if (i == 3) {
            return 0.1;
        } else if (i == 2) {
            return 0.05;
        }

        return 0;
    }

    double calculatePayPriceByTypes(int i) {
        double discount = calculateDiscountByTypes(i);

        return BOOK_PRICE * (1 - discount) * i;
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
