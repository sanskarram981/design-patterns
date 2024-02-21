package com.design.solid.dependencyinversion;

public class HpLaptop {
    private KeyBoard keyBoard;
    private Mouse mouse;
    public HpLaptop(KeyBoard keyBoard,Mouse mouse){
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void point(){
        this.mouse.point();
    }

    public void type(){
        this.keyBoard.type();
    }

}
