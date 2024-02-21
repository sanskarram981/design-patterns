package com.design.solid.dependencyinversion;

public class WireMouse implements Mouse {
    @Override
    public void point() {
        System.out.println("wire mouse pointing");
    }
}
