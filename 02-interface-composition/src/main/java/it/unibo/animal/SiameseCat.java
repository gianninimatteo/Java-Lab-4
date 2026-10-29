package it.unibo.animal;

public class SiameseCat implements Animal {
    
    public double averageWeight() {
        return 5;
    }

   public  boolean canEatVegetables() {
        return true;
    }
    
   public boolean canEat(Animal a) {
        return a instanceof Squirrel; //Restituisce true se a è uno scoiattolo, false altrimenti.
    }

}