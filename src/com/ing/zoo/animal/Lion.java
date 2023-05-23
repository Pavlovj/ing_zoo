package com.ing.zoo.animal;

public class Lion implements Carnivore {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    @Override
    public boolean canPerformTrick() {
        return true;
    }

    @Override
    public void performTrick() {
        System.out.println("The lion jumps through a hoop.");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom thx mate");
    }
}
