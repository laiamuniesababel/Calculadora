package services;

public class Division implements IOperacion{
    @Override
    public double calcular(double num1, double num2) {
        if(num2 == 0){
            System.out.println("No se puede dividir entre 0");
            return Double.NaN;
        }

        return (num1/num2);

    }
}
