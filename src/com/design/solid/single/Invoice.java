package com.design.solid.single;

public class Invoice {
    private Marker marker;
    private int totalPrice;

    public Invoice(Marker marker){
        this.marker = marker;
    }
    public void calculatePrice(){
        this.totalPrice = this.marker.quantity * this.marker.price;
        System.out.println("total price is : "+this.totalPrice);
    }
}
