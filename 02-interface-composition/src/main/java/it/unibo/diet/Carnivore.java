package it.unibo.diet;

public class Carnivore implements Diet {
    public boolean canEatVegetables() {
        return false;
    }

    public boolean canEatMeat() {
        return true;
    }
}