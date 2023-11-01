package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseadded;
    private boolean toppoingsadded;

    private boolean bagadded;
    private boolean isbillgenerator;
    private int cheeseprice;
    private int toppingsprice;
    private int bagprice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //your code goes here --------------------------------
        if(isVeg) {
            this.price = 300;
            toppingsprice = 70;
        }
        else {
            this.price = 400;
            toppingsprice = 120;
        }
        cheeseprice = 80;
        bagprice = 20;
    }

    public int getPrice(){
        if(isVeg) return 300;
        else return 400;
    }

    public void addExtraCheese(){
        // your code goes here -------------------------------
        if(!cheeseadded) {
            cheeseadded = true;
            price += cheeseprice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppoingsadded && cheeseadded) {
            toppoingsadded = true;
            price += toppingsprice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bagadded) {
            bagadded = true;
            price += bagprice;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + this.price+"\n";
        if(!isbillgenerator) {
            if(cheeseadded) {
                bill += "Extra Cheese Added: " + cheeseprice +"\n";
            }
            if(toppoingsadded) {
                bill += "Extra Toppings Added: " + toppingsprice+"\n";
            }
            if(bagadded) {
                bill += "Paperbag Added: " + bagprice+"\n";
            }
            bill += "Total Price: " + price;
            isbillgenerator = true;
        }
        return bill;
    }
}
