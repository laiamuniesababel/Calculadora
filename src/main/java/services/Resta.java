package services;

public class Resta implements IOperacion{
    @Override
    public double calcular(double num1, double num2) {
        return (num1 - num2);
    }
}
