package com.ing.zoo;

import com.ing.zoo.animal.*;

public class MainApplication {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Donkey("Donkey"),
                new Fox("Sweeper")
        };

        Zoo zoo = new Zoo(animals);

        zoo.run();
            }
}
