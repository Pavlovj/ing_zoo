package com.ing.zoo.animal;

public class Hippo implements Herbivore {
    private String name;

    public Hippo(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    @Override
    public void performTrick() {
        // Hippo does not perform tricks
        System.out.println("I don't perform tricks.");
    }

    @Override
    public boolean canPerformTrick() {
        return false;
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch lovely");

    }
}
