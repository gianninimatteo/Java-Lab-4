package it.unibo.qa;

/**
* Questa classe descrive un gatto.
*/
public class Cat {
    private final String name;
    private String color; //color non lo dichiaro final perchè è un parametro che deve poter cambiare
    private final String breed;
    private final int age;
    private static final int  NINE = 9; //costante
    private static final int NUMBER_OF_LIVES = NINE;

    /**
    * Costruttore.
    */
    public Cat(final String name, final String color, final String breed, final int age) { 
        // final in color impedisce di riassegnare il parametro ricevuto
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    /**
    * Metodo.
    */
    public String meow() {
        return "Meow, meow, I am " + name + ", hear me purr, In this feline world, I'm the star, that's for sure. "
        + "With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    /**
    * Metodo.
    */
    public void setColor(final String c) { //final impedisce di riassegnare il parametro ricevuto
        this.color = c;
    }

    /**
    * Metodo.
    */
    public String getColor() {
        return this.color;
    }

    /**
    * Metodo.
    */
    public int hasSameColor(final Cat cat) { //final impedisce di riassegnare il parametro ricevuto
        if (color.equals(cat.color)) { // .equals() confronta il testo delle due stringhe.
            return 1;
        } else {
            return 0;
        }
    }

    /**
    * Metodo.
    */
    public String getName() {
        return name;
    }

    /**
    * Metodo.
    */
    public int getAge() {
        return age;
    }

    /**
    * Metodo.
    */
    public String getBreed() { //il campo è 'final' ma non stiamo modificando un valore, sto solo faendo una 'get' ed è permesso.
        return breed;
    }

    /**
    * Main.
    */
    public static void main(final String[] args) {
        Cat cat = new Cat("Kiri", "Gray", "Kor", 4);
        System.out.println(cat.meow()); 
    }
}
