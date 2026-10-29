package it.unibo.animal;

public class KoratCat implements Animal {
    public double averageWeight() {
        return 3.5;
    }

   public  boolean canEatVegetables() {
        return false;
    }
    
   public boolean canEat(Animal a) {
        return a instanceof Squirrel; //Restituisce true se a è uno scoiattolo, false altrimenti.
    }
}
