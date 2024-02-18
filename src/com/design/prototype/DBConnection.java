package com.design.prototype;

public class DBConnection implements Cloneable {
    private String hostname;
    private int port;
    private String data;

    public DBConnection(String hostname,int port) throws InterruptedException {
        this.hostname = hostname;
        this.port = port;
        Thread.sleep(5000);
        this.data = "data loaded from the server using network protocol";
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

    @Override
    public String toString() {
        return "DBConnection{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
