package com.liuwill.kata.harry_potter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Liu Will - liuwill@live.com on 2018/3/17.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/3/17
 * @desc
 */
@Tag("fast")
public class BookSellerTest {
    @Test
    @DisplayName("check current discount")
    void testCountByTypes () {
        BookSeller bookSeller = BookSeller.open();

        assertEquals(0.25, bookSeller.calculateDiscountByTypes(5));
        assertEquals(0.2, bookSeller.calculateDiscountByTypes(4));
        assertEquals(0.1, bookSeller.calculateDiscountByTypes(3));
    }

    @Test
    @DisplayName("check current price")
    void testPriceByTypes () {
        BookSeller bookSeller = BookSeller.open();

        assertEquals(30, bookSeller.calculatePayPriceByTypes(5));
        assertEquals(8, bookSeller.calculatePayPriceByTypes(1));
        assertEquals(15.2, bookSeller.calculatePayPriceByTypes(2));
    }

    @Test
    @DisplayName("we can generate book order")
    void testGenerateBookOrder () {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int fifth = 0;

        BookOrder bookOrder = BookSeller.generateHarryPotterBookOrder(first, second, third, forth, fifth);
        String printContent = bookOrder.toString();

        assertTrue(printContent.contains(first + " copies of the first book"));
        assertTrue(printContent.contains(third + " copies of the third book"));
        assertFalse(printContent.contains(fifth + " copies of the fifth book"));

        BookOrder simpleOrder = new BookOrder();
        BookSku bookSku = new BookSku();
        bookSku.setNumber(first);
        bookSku.setSkuId("book");
        simpleOrder.putSku(bookSku);
        simpleOrder.putSku(new BookSku("book", second));
        assertTrue(simpleOrder.toString().contains((first + second) + " copies of the book book"));
    }
}
