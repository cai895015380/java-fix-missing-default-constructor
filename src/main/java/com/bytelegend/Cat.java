package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = new String(name);
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
