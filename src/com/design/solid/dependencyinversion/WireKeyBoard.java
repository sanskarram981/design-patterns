package com.design.solid.dependencyinversion;

public class WireKeyBoard implements KeyBoard {
    @Override
    public void type() {
        System.out.println("wire keyboard typing....");
    }
}
