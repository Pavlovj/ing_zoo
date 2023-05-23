package com.ing.zoo.animal;

import java.util.Random;

public class Tiger implements Carnivore {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("jumps in tree");
        } else {
            System.out.println("scratches ears");
        }
    }

    @Override
    public boolean canPerformTrick() {
        return true;
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }
}
