package com.ing.zoo.animal;

public class Fox implements Carnivore {
    private String name;

    public Fox(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("What does the fox say");
    }

    @Override
    public boolean canPerformTrick() {
        return false;
    }

    @Override
    public void performTrick() {
        System.out.println("I don't perform tricks");
    }

    @Override
    public void eatMeat() {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
    }
}
