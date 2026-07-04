import java.util.Scanner;
public class BucleNumeros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hasta donde llega el bucle?");
        int fin = teclado.nextInt();

        int suma = 0;

        for (int i = 1; i <= fin; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
