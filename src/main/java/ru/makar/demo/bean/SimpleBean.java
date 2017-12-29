package ru.makar.demo.bean;

import ru.makar.demo.annotation.RandomInt;

@SuppressWarnings({"WeakerAccess", "unused"})
public class SimpleBean {
    @RandomInt
    private int a;
    @RandomInt(bound = 500)
    private int b;

    public int sum() {
        return a + b;
    }

    @Override
    public String toString() {
        return a + " + " + b + " = " + sum();
    }
}
