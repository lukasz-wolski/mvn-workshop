package pl.jug.szczecin.workshop;

public class CalculatorRest {

    public double add(double left, double right) {
        return new Calculator().add(left, right);
    }

}
