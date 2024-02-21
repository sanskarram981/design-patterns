package com.design.solid.open;

import com.design.solid.single.Invoice;

public class InvoiceDaoSMTP implements InvoiceDao {
    private Invoice invoice;

    public InvoiceDaoSMTP(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save() {
        System.out.println("invoice saved to smtp location");
    }
}
