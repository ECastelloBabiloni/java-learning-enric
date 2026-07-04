import java.util.Scanner;
public class ContarPares {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hasta que numero comrovamos?");
        int fin = teclado.nextInt();

        System.out.println("En esta lista hay " + contarPares(fin) + " numeros pares, y la suma de sus valores es: " + sumarPares(fin));

    }

    public static int contarPares (int fin) {
        int contador = 0;

        for (int i = 1; i <= fin; ++i) {
            if (i % 2 == 0) {
                contador += 1;
            }
        }
        return contador;
    }
    public static int sumarPares (int fin){
        int suma = 0;

        for (int i = 1; i <= fin; ++i) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;

    }
}
