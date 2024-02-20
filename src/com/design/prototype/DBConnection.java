package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class DBConnection implements Cloneable {
    private String hostname;
    private int port;
    private String data;
    private List<String> domains;

    public DBConnection(){

    }

    public DBConnection(String hostname,int port) throws InterruptedException {
        this.hostname = hostname;
        this.port = port;
        Thread.sleep(5000);
        this.data = "data loaded from the server using network protocol";
        this.domains = new ArrayList<>(List.of("www.google.com","www.yahoo.com","www.firefox.com"));
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    @Override
    public String toString() {
        return "DBConnection{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       DBConnection dbConnection = (DBConnection) super.clone();
       dbConnection.setDomains(new ArrayList<>(this.getDomains()));
       return dbConnection;
    }
}
