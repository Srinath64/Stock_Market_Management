package com.company;

import java.util.ArrayList;


public class Portfolio {

    private static ArrayList<Stock> stocks = new ArrayList<Stock>();

    public static ArrayList<Stock> getStocks() {
        return stocks;
    }

    public static void setStocks(ArrayList<Stock> stocks) {
        Portfolio.stocks = stocks;
    }

}