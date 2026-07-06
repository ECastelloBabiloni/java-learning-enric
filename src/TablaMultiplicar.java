import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tabla del numero: ");
        int numero =  teclado.nextInt();

        mostrarTabla(numero);
    }
    public static void mostrarTabla(int numero){
        int resultado;
        for (int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }

}
