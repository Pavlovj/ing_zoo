package com.ing.zoo;

import com.ing.zoo.animal.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Represents a Zoo.
 */
public class Zoo {

    private final List<Animal> animals;
    private final Map<String, Consumer<String[]>> commandMap;

    /**
     * Constructs a Zoo object with the given array of animals and creates the command map
     * @param animals an array of animals to add to the zoo
     */
    public Zoo(Animal[] animals) {
        this.animals = Arrays.asList(animals);
        commandMap = createCommandMap();
    }

    /**
     * Runs the zoo application, accepting user commands from the console.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Voer uw commando in (exit om te stoppen): ");
            String input = scanner.nextLine();

            String[] args = input.split(" ");
            String command = args[0];


            if (commandMap.containsKey(command)) {
                // If the command is valid, get the corresponding action from the command map
                // and execute it, passing the tokens as arguments
                commandMap.get(command).accept(args);
            } else {
                // display an error message
                unknownCommand(input);
            }
        }
    }

    /**
     * Creates the command map with the supported commands and their actions
     * @return the command map
     */
    private Map<String, Consumer<String[]>> createCommandMap() {
        Map<String, Consumer<String[]>> map = new HashMap<>();

        map.put("hello", tokens -> {
            String[] names = Arrays.copyOfRange(tokens, 1, tokens.length);
            sayHello(names);
        });
        map.put("give", tokens -> {
            if (tokens.length > 1) {
                String action = tokens[1];
                switch (action) {
                    case "leaves": {
                        giveLeaves();
                        break;
                    }
                    case "meat": {
                        giveMeat();
                        break;
                    }
                    default:
                        unknownCommand();
                }
            }
        });
        map.put("perform", tokens -> {
            if (tokens.length > 1) {
                String action = tokens[1];
                switch (action) {
                    case "trick": {
                        performTrick();
                        break;
                    }
                    default:
                        unknownCommand();
                }
            }
        });
        map.put("help", tokens -> {
            displayHelp();
        });
        map.put("exit", tokens -> System.exit(0));

        return map;
    }

    /**
     * Displays the available commands.
     */
    private void displayHelp() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nAvailable Commands:\n");

        for (String command : commandMap.keySet()) {
            sb.append(command);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    /**
     * Prints an unknown command message with the given input
     * @param input the unknown command input
     */
    private void unknownCommand(String input) {
        System.out.printf("Unknown command: %s\n", input);
    }

    /**
     * Prints an unknown command message
     */
    private void unknownCommand() {
        System.out.println("Unknown command...");
    }

    /**
     * Says hello to the specified names or all animals if no names are provided
     * @param names the names of the animals to say hello to
     */
    private void sayHello(String[] names) {
        for (Animal animal : animals) {
            if (names.length > 0) {
                for (String currentName : names) {
                    if (animal.getName().equalsIgnoreCase(currentName)) {
                        animal.sayHello();
                    }
                }
            } else {
                animal.sayHello();
            }
        }
    }

    /**
     * Feeds leaves to herbivorous animals
     */
    private void giveLeaves() {
        for (Animal animal : animals) {
            if (animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
            }
        }
    }

    /**
     * Feeds meat to carnivorous animals
     */
    private void giveMeat() {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            }
        }
    }

    /**
     * Performs a trick for animals that can perform tricks
     */
    private void performTrick() {
        for (Animal animal : animals) {
            if (animal.canPerformTrick()) {
                animal.performTrick();
            }
        }
    }

}
