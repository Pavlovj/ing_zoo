package com.ing.zoo.animal;

import java.util.Random;

public class Pig implements Herbivore, Carnivore {
    private String name;

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("oink oink");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }

    @Override
    public boolean canPerformTrick() {
        return true;
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");

    }
}
