package com.ing.zoo.animal;

public class Zebra implements Herbivore {
    private String name;

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("zebra zebra");
    }

    @Override
    public void performTrick() {
        // Zebra does not perform tricks
        System.out.println("I don't perform tricks.");
    }

    @Override
    public boolean canPerformTrick() {
        return false;
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch zank yee bra");
    }
}
