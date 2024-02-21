package com.design.solid.single;

public class InvoicePrint {
    private Invoice invoice;

    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }
    public void printInvoice(){
        System.out.println("invoice printed");
    }
}
