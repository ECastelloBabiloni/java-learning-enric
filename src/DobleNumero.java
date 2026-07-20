import java.util.Scanner;
public class DobleNumero {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        Double numero = teclado.nextDouble();

        System.out.println(doblar(numero));
    }
    public static double doblar(double numero){
        double multiplicacion =  numero * 2;
        return multiplicacion;
    }
}
