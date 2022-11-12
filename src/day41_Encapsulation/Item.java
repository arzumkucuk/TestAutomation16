package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name){
        this.name = name;
    }

    public Item(String name, double unitPrice) {
        this(name);
        this.unitPrice = unitPrice;
    }

    public Item(String name, double unitPrice, int quantity) {
        this(name, unitPrice);
        this.quantity = quantity;
    }
    public double calcCost (){
        double totalCost = unitPrice * quantity;
        return totalCost;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity= " + quantity +
                ", Total Price= $"+ calcCost()+
                '}';
    }
}

class ShoppingList{
    public static void main(String[] args) {

        Item[] items = {new Item("Pen",3,5), new Item("bag", 99.90,3),
        new Item("sunglasses", 220,2),new Item("Water",1.99,25),
        new Item("Gum",0.90,50) };

        ArrayList<Item> totalItems = new ArrayList<>(Arrays.asList(items));

        double total = 0;
        for (Item each : totalItems){
            total += each.calcCost();
        };
        System.out.println("Total items= $"+total);


    }
}
/*
    1.create a class called Item
    instance variables:
    name, unitPrice, quantity

   add a constructor that can initialize the fields

   instance methods:
        calCost(): returns the total cost as double
                    hint: totalCost = quantity * unitPrice

        toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

create a class called ShoppingList
        create 5 objects of item and store them into ArrayList of Items

        calculate the total cost of all Items in the list

 */
