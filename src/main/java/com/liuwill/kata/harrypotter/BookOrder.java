package com.liuwill.kata.harrypotter;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by Liu Will - liuwill@live.com on 2018/5/3.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/5/3
 * @desc
 */
public class BookOrder {
    private HashMap<String, BookSku> orderSkuMap = new HashMap<>();

    public void putSku(BookSku bookSku) {
        if (bookSku.getNumber() <= 0) {
            return;
        }

        if (orderSkuMap.containsKey(bookSku.getSkuId())) {
            BookSku existBookSku = orderSkuMap.get(bookSku.getSkuId());
            existBookSku.setNumber(existBookSku.getNumber() + bookSku.getNumber());

            orderSkuMap.put(bookSku.getSkuId(), existBookSku);
        } else {
            orderSkuMap.put(bookSku.getSkuId(), bookSku);
        }
    }

    public Map<String, BookSku> getOrderSkuMap() {
        return orderSkuMap;
    }

    @Override
    public String toString() {
        StringJoiner orderContent = new StringJoiner("\n");
        orderContent.add("BookOrder{");
        for (String key : orderSkuMap.keySet()) {
            BookSku bookSku = orderSkuMap.get(key);
            orderContent.add(bookSku.toString());
        }
        orderContent.add("}");
        return orderContent.toString();
    }
}
