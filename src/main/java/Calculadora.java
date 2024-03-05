import services.IOperacion;

import java.util.Scanner;

public class Calculadora {
    private IOperacion operacion;

    public Calculadora(IOperacion operacion){
        this.operacion = operacion;
    }

    public void ejecutarOperacion(Scanner sc){
        System.out.println("Introduce el primer operando");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduce el segundo operando");
        double num2 = sc.nextDouble();
        sc.nextLine();

        double resultado = operacion.calcular(num1, num2);
        System.out.println("Resultado: " + resultado);

    }
}
