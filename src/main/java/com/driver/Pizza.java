package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isBillAdded;
    private boolean istakeAwayAdded;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;



    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.isVeg = isVeg;


        if(this.isVeg)
        {

            this.price += 300;
        }else{
            price+=400;
        }

        this.bill += "Base Price Of The Pizza: "+price+ "\n";

    }
    public void setPrice(int price) {
        this.price = price;
    }


    boolean flag1=false;
    public void addExtraCheese(){
        // your code goes here
        if(flag1 == false)
        {
            this.bill += "Extra Cheese Added: 80" +"\n";
            this.price += 80;
            flag1 = true;
        }
    }

    boolean flag2=false;
    public void addExtraToppings(){
        // your code goes here
        if(flag2 == false) {
            if(!isVeg){
                this.bill += "Extra Toppings Added: 120"+ "\n";
                this.price += 120;
            }
            else
            {
                this.bill += "Extra Toppings Added: 70" +"\n";
                this.price += 70;
            }

            flag2 = true;
        }
    }

    boolean flag3=false;
    public void addTakeaway(){
        // your code goes here
        if(flag3 == false)
        {
            this.price += 20;
            this.bill += "Paperbag Added: 20" + "\n";
            flag3 = true;
        }
    }

    public String getBill(){
        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                (flag1?("\nExtra Cheese Added: 80"):" ") +
                (flag2?("\nExtra Toppings Added: "  + (isVeg?70:120)):"") +
                (flag3?("\nPaperbag Added: 20"):"") +
                "\nTotal Price: "+ this.price + "\n"
        );
        return this.bill;
    }
    public int getPrice(){
        return this.price;
    }
}
