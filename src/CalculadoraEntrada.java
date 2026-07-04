import java.util.Scanner;

public class CalculadoraEntrada {


    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

            System.out.println("Primer Numero: ");
        double numero1 = teclado.nextDouble();
            System.out.println("Segundo Numero: ");
        double numero2 = teclado.nextDouble();

        double suma = sumar (numero1, numero2);
        double resta = restar (numero1, numero2);
        double multiplicacion = multiplicacion ( numero1, numero2);


        System.out.println("Suma ="+suma);
        System.out.println("Resta ="+resta);
        System.out.println("Multiplicacion ="+multiplicacion);

        if (numero2 != 0){
            double division = dividir (numero1, numero2);
            System.out.println("Division = " + division);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
    public static double sumar (double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }
    public static double restar (double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }
    public static double multiplicacion(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }
    public static double dividir (double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }
}

