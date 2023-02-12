package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean isDulex;
    private String bill;
    private boolean isBillAdded;
    private boolean istakeAwayAdded;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = 0;
        this.isVeg = isVeg;
        this.isDulex = false;
        this.bill = "";
        this.isBillAdded = false;
        this.istakeAwayAdded = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;

        if(isVeg)
        {
            this.bill += "Base Price Of The Pizza: 300" + "\n";
            this.price += 300;
        }
        if(isDulex == true)
        {
            this.bill += "Non-veg pizza base price = 400" + "\n";
            this.price += 400;
        }
        if(!isVeg)
        {
            this.bill += "Non-veg pizza base price = 400" + "\n";
            this.price += 400;
        }

    }

    public Boolean getDulex() {
        return isDulex;
    }

    public void setDulex(Boolean dulex) {
        isDulex = dulex;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded == false)
        {
            this.bill += "Extra Cheese Added: 80" +"\n";
            this.price += 80;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingsAdded == false) {
            if(!isVeg){
                this.bill += "Extra Toppings Added: 120"+ "\n";
                this.price += 120;
            }
            else
            {
                this.bill += "Extra Toppings Added: 70" +"\n";
                this.price += 70;
            }

            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeAwayAdded == false)
        {
            this.price += 20;
            this.bill += "Paperbag Added: 20" + "\n";
            this.istakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillAdded == false)
        {
            this.bill += "Total Price: 470" +"\n";
            this.isBillAdded = true;
            return this.bill;
        }
        return "";
    }
}
