package com.ing.zoo.animal;

public class Donkey implements Herbivore {
    private String name;

    public Donkey(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("ior ior");
    }

    @Override
    public void performTrick() {
        // Zebra does not perform tricks
        System.out.println("I dance a bit");
    }

    @Override
    public boolean canPerformTrick() {
        return true;
    }

    @Override
    public void eatLeaves() {
        System.out.println("shrek 3");
    }
}
