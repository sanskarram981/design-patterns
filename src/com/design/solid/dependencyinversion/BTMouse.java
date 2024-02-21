package com.design.solid.dependencyinversion;

public class BTMouse implements Mouse {
    @Override
    public void point() {
        System.out.println("bluetooth mouse pointing");
    }
}
