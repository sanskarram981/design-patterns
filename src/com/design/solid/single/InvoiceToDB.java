package com.design.solid.single;

public class InvoiceToDB {
    private Invoice invoice;

    public InvoiceToDB(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        System.out.println("invoice saved to DB");
    }
}
