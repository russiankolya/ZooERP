package org.example.service;

import org.example.model.Animal;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryService {

    public boolean checkAnimalHealth(Animal animal) {
        return Math.random() >= 0.1;
    }

}