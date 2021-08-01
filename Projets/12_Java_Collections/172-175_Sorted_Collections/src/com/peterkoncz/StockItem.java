package com.peterkoncz;


/**
 * Basic stockItem class here we are gonna store the name, price, quantity
 * also we will override the equals and hashCode and implement comparable interface
 * so the stockItems can be used in a sorted collections
 */
public class StockItem implements Comparable<StockItem>{

    private final String name;
    private double price;
    private int quantityInStock; //it is up to you if you initialize it here or in the constructor both are the same

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }
    //overloaded constructor if you wish to set the quantity as well
    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityInStock;
    }

    public void setPrice(double price) { // do a validation for less then 0 number
        if (price < 0) {
            this.price = price;
            }
        }
    //setter for stock will be called to adjust stock
    //increase or decrease based on if stock lvl is increased or sold !
    public void adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0){ //basic validation here !
            this.quantityInStock = newQuantity;
        }
    }

//Override the equals and the hasCode methods


    @Override
    public int hashCode() {
        return this.name.hashCode() + 22; //can be any number
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this){
            return true; //if it is the same obj im memory
        }

        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;  //checking for null or diff classes
        }

        String objName = ((StockItem) obj).getName();
         return this.name.equals(objName);  //we are only checking for name and using the String equals
    }
  //we also must override the compareTo method from the interface
    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o){ // checking if it is the same obj in memory
            return 0; //0 because they are equal
        }

        if (o != null) {//must check for null to avid the errors in case null gets into the method
            return this.name.compareTo(o.getName()); //using the String compareTo method to return the value ! (-1, 0, or 1)
        }
        throw new NullPointerException(); //if you want to use to compareTo function you make sure it is not null ! (in case if it is null throw an exception)
    }


    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
