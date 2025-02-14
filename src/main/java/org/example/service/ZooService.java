package org.example.service;

import org.example.model.Animal;
import org.example.model.Herbivore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZooService {
    private final VeterinaryService veterinaryService;

    public ZooService(VeterinaryService veterinaryService) {
        this.veterinaryService = veterinaryService;
    }

    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        if (veterinaryService.checkAnimalHealth(animal)) {
            System.out.println("The animal has been added (Name: " + animal.getName() + ", Type: " + animal.getType() + ")");
        } else {
            System.out.println("The animal has not passed veterinary checks");
        }
    }

    public void printAllAnimals() {
        animals.forEach(animal ->
                System.out.println(animal.getName() + " - " + animal.getType() + ", eats " + animal.getFoodAmount() + " kg a day")
        );
    }

    public int getTotalFoodConsumption() {
        return animals.stream().mapToInt(Animal::getFoodAmount).sum();
    }

    public void printContactZooAnimals() {
        animals.stream()
                .filter(animal -> animal instanceof Herbivore && ((Herbivore) animal).canBeInContactZoo())
                .forEach(animal -> System.out.println(animal.getName() + " - " + animal.getType()));
    }
}
