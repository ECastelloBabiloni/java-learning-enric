import java.util.Scanner;
public class ComprobarPar {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Que numero quieres comprobar?: ");
        int numero = teclado.nextInt();

        boolean resultado = par(numero);

        if (resultado){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
    public static boolean par (int numero) {
        boolean resultado;
        if (numero % 2 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
