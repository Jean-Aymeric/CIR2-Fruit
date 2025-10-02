package com.jad;

public abstract class Fruit {
    public String getName() {
        return this.name;
    }

    private final String name;

    public Fruit(final String name) {
        this.name = name;
    }
}
