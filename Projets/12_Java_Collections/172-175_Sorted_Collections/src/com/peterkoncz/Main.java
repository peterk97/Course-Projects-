package com.peterkoncz;

import java.util.Map;

/**
 * This application will demonstrate how the Linked HashMap can be useful and
 * and we will ultimately extend it to use a treeMap.
 *
 * In this project the customer can add the shopping items to the basket
 * after choosing theme from the all the items on sale !
 *
 * For this we need to maintain two collections
 * 1. is all the items that are in stock
 * 2. is the items that the customer added ot the basket
 * also the items are going to be added in an alphabetical order !
 */

public class Main {

    //StockList Obj
    public static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.5,200);
        stockList.addStock(temp);
        //Testing and add some quantity to the stock some existing as well
        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);


        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",2.5,36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList); // this uses the toString we overwrote in the StockList class

        //printing the keys just to see that the keys are stored the same way ! 
        for (String key : stockList.Items().keySet()){
            System.out.println(key);
        }

        //here we are creating a Basket and sell some fo the stock
        Basket peterBasket = new Basket("Peter");
        sellItem(peterBasket,"car",1);
        System.out.println(peterBasket);

        sellItem(peterBasket,"car",1);
        System.out.println(peterBasket);

        if (sellItem(peterBasket,"car",1) != 1){//third time should fail because we only have two cars
            System.out.println("There are no more cars in stock"); //wrapped it with and if to print a message
        }


        sellItem(peterBasket,"spanner",5); //item doesn't exist
        System.out.println(peterBasket);

        sellItem(peterBasket, "juice",4);
        sellItem(peterBasket, "cup",12);
        sellItem(peterBasket, "bread",1);
        System.out.println(peterBasket);

        System.out.println(stockList);



        //using the StockList class Items method to bypass the correct way to add Stock !
        //one thing to be aware of:"it is only the collection itself is unmodifiable the individual objects can be accessed and modified!"
        //two ways to access individual items !
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        //this case it is an unmodifiableMap so it should throw an exception if we try to put some date in there
        //confirm that works
//        temp = new StockItem("pen",1.12);
//        stockList.Items().put(temp.getName(),temp);

   //Here printing the PriceList Map
        //here we are providing an unmodifiable map for name and prices for the caller to use
        //the entries in the map consists from a pairs of Strings and Doubles now both of these are immutable
        //so not only the map cannot be modified but the individual entries in it cannot be either!
        for (Map.Entry<String,Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }


    }

//Creating a Static method in Main Class to sell stuff
    //method will return the quantity sold in int
    public static int sellItem(Basket basket, String item, int quantity){
        //retrieve the item from stockList first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }


}
