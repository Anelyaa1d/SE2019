package com.company;

import java.util.ArrayList;
import java.util.List;

public class Store {

//    private String name;
//    private String ID;
//    public Collection<String> items;
//    public Collection<String> customers;
//    protected Stores stores;

    protected static List<Item> products = new ArrayList<Item>();

    public Store () {
        //this.initStoreItems();
    }

    public static List<Item> getItems() {
        return products;
    }



    public void initStoreItems() {
//        String [] productNames = {"The Shadow of the Wind", "The Kite Runner", "Little Women"};
//        Double [] productPrice = {50.00d, 70.00d, 20.00d};
//
//        for (int i=0; i < productNames.length; i++) {
//            this.products.add(new Item(i+1, productNames[i], productPrice[i]));
//        }
    }



}
