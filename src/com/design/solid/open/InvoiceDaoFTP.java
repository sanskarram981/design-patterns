package com.design.solid.open;

import com.design.solid.single.Invoice;

public class InvoiceDaoFTP implements InvoiceDao {
    private Invoice invoice;

    public InvoiceDaoFTP(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save() {
        System.out.println("invoice saved to ftp location");
    }
}
