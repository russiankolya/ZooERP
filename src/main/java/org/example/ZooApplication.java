package org.example;

import org.example.model.*;
import org.example.service.ZooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZooApplication implements CommandLineRunner {

    private final ZooService zooService;

    public ZooApplication(ZooService zooService) {
        this.zooService = zooService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ZooApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Zoo menu ---");
            System.out.println("1. Add an animal");
            System.out.println("2. Print a list of all animals");
            System.out.println("3. Print the total food consumption");
            System.out.println("4. Print animals for the contact zoo");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addAnimal(scanner);
                    break;
                case 2:
                    zooService.printAllAnimals();
                    break;
                case 3:
                    System.out.println("Total food consumption: " + zooService.getTotalFoodConsumption() + "kg a day.");
                    break;
                case 4:
                    zooService.printContactZooAnimals();
                    break;
                case 0:
                    running = false;
                    System.out.println(".");
                    break;
                default:
                    System.out.println("Incorrect input, try again.");
            }
        }
        scanner.close();
    }

    private void addAnimal(Scanner scanner) {
        System.out.println("Enter animal type (1 - Monkey, 2 - Rabbit, 3 - Tiger, 4 - Wolf): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.println("Enter inventory id: ");
        int inventoryId = scanner.nextInt();

        System.out.println("Enter amount of food (kg a day): ");
        int foodAmount = scanner.nextInt();

        int kindness = 0;
        if (type == 1 || type == 2) {
            System.out.println("Enter kindness: ");
            kindness = scanner.nextInt();
        }

        Animal animal;
        switch (type) {
            case 1:
                animal = new Monkey(inventoryId, foodAmount, name, kindness);
                break;
            case 2:
                animal = new Rabbit(inventoryId, foodAmount, name, kindness);
                break;
            case 3:
                animal = new Tiger(inventoryId, foodAmount, name);
                break;
            case 4:
                animal = new Wolf(inventoryId, foodAmount, name);
                break;
            default:
                System.out.println("Incorrect animal type!");
                return;

        }
        zooService.addAnimal(animal);
    }
}
