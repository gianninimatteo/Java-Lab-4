package it.unibo.encapsulation;

public class Calculator {

    private int operationsPerformed;
    private double lastResult;

    public Calculator() {
        this.operationsPerformed = 0;
        this.lastResult = 0;
    }

    // I 2 metodi get per leggere i campi dall'esterno della classe
    public int getOperationsPerformed(){
        return this.operationsPerformed;
    }
    public double getLastResult(){
        return this.lastResult;
    }

    // Il metodo essendo private può essere richiamato solo dall'interno della classe in cui è definito.
    private double updateStatus(final double val) {
        this.lastResult = val;
        this.operationsPerformed++;
        return this.lastResult;
    }

    public double add(final double n1, final double n2) {
        return updateStatus(n1 + n2);
    }

    public double sub(final double n1, final double n2) {
        return updateStatus(n1 - n2);
    }

    public double mul(final double n1, final double n2) {
        return updateStatus(n1 * n2);
    }

    public double div(final double n1, final double n2) {
        return updateStatus(n1 / n2);
    }

    public static void printCalculatorStatus(final Calculator calc) {
        System.out.println("operations performed: " + calc.operationsPerformed);
        System.out.println("last result" + calc.lastResult + "\n");
    }

}
