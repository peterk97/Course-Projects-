package com.peterkoncz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    //if you want to print the basket's content in order
    //we can change the HashMap to a LinkedHM or a TreeMap !!
    //because we implemented the comparable in StockItem class so it can do the comparison
    public Basket(String name) {
        this.name = name;
       // this.list = new HashMap<>();
        this.list = new TreeMap<>();
    }


    public int addToBasket(StockItem item, int quantity){
        if ((item != null) && (quantity > 0)){
            //this line checks if there is already some quantity of an item if yes returns the quantity of not initialize the quantity to 0
            //because the map key is the StockItem and the value is the quantity (int)
            int inBasket = list.getOrDefault(item,0);
            //adding the item and teh quantity if there is some and also additionally the quantity parameter if you want to add some more!
            list.put(item,inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    //Getter for the Map (list) returns the unmodifiable Map
    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    //toString method similar like the StockList will return a the whole basket so multiple items
    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem,Integer> item : list.entrySet()){
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}























