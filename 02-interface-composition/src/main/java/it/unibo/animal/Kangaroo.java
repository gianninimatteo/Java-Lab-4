package it.unibo.animal;

public class Kangaroo implements Animal {
    public double averageWeight() {
        return 55.0;
    }

   public  boolean canEatVegetables() {
        return true;
    }
    
   public boolean canEat(Animal a) {
        return false;
    }
}