package com.design.solid.dependencyinversion;

public class BTKeyBoard implements KeyBoard {
    @Override
    public void type() {
        System.out.println("bluetooth keyboard typing...");
    }
}
