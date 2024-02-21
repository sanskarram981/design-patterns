package com.design.solid.open;

import com.design.solid.single.Invoice;

public class InvoiceDaoFile implements InvoiceDao {
    private Invoice invoice;

    public InvoiceDaoFile(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save() {
        System.out.println("invoice saved to file");
    }
}
