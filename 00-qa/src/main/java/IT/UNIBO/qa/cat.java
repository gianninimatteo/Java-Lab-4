package it.unibo.qa;

//this class describes a cat
public class Cat {
    private String name;
    private String color;
    private final String breed;
    private final int age;
    private static final int  NINE = 9;
    public static int numberOfLives= NINE;

    public Cat(String name, String color, final String breed, final int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    // This method is useful because it allows the cat to meow and introduce itself to the world in a single line of code.
    public String meow() {
        return "Meow, meow, I am " + name + ", hear me purr, In this feline world, I'm the star, that's for sure. With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public int hasSameColor(Cat cat) {
        if (color.equals(cat.color)) { //.equals() confronta il testo delle due stringhe.
            return 1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] ARGS) {
        Cat cat = new Cat("Kiri", "Gray", "Kor", 4);
        System.out.println(cat.meow()); 
    }
}