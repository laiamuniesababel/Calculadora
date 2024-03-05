import services.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;

        do{

            System.out.println("¡¡Bienvenido a la calculadora!! Seleccione una operación");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = sc.nextLine().trim();

            switch (opcion){
                case "1":
                    ejecutar(new Suma(), sc);
                    break;
                case "2":
                    ejecutar(new Resta(), sc);
                    break;
                case "3":
                    ejecutar(new Multiplicacion(), sc);
                    break;
                case "4":
                    ejecutar(new Division(), sc);
                    break;
                case "5":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while(!opcion.equals("5"));

        sc.close();
    }

    public static void ejecutar(IOperacion operacion, Scanner sc){
        Calculadora calculadora = new Calculadora(operacion);

        calculadora.ejecutarOperacion(sc);
    }
}