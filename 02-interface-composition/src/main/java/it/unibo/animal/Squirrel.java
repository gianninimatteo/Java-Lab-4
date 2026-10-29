package it.unibo.animal;

public class Squirrel implements Animal {
    
    public double averageWeight() {
        return 1;
    }

   public  boolean canEatVegetables() {
        return true;
    }
    
   public boolean canEat(Animal a) {
        return false;
    }

}