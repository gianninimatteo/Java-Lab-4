package it.unibo.animal;

public class KoratCat implements Animal {

    private Diet diet  = new Carnivore();

    public double averageWeight() {
        return 3.5;
    }

   public  boolean canEatVegetables() {
        return diet.canEatVegetables();
    }
    
   public boolean canEat(Animal a) {
        return this.averageWeight() > a.averageWeight();
    }
}
