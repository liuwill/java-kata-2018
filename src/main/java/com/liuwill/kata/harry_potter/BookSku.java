package com.liuwill.kata.harry_potter;

/**
 * Created by Liu Will - liuwill@live.com on 2018/5/3.
 * Copyright (c) 2012-2017 All Rights Reserved.
 *
 * @author: liuwill@live.com liuwill
 * @date 2018/5/3
 * @desc
 */
public class BookSku {
    private String skuId;
    private int number;

    public BookSku(String skuId, int number) {
        this.skuId = skuId;
        this.number = number;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " copies of the "+ skuId +" book";
    }
}
