package it.unibo.encapsulation;

public class Student {

    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;

    public Student(final int id, final String name, final String surname, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
    }

    //Siccome i parametri sono private i 4 metodi 'get' ci servono per LEGGERE (ma non modificare) i campi private dall'esterno della classe.
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getMatriculationYear() {
        return matriculationYear;
    }

    public void printStudentInfo() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student surname: " + this.surname);
        System.out.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }
}
