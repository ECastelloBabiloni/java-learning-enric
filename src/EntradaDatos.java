import java.util.Scanner;
public class EntradaDatos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

        System.out.println("Escribe tu edad: ");
        int edad =  teclado.nextInt();
        System.out.println("Tienes " + edad + " años");

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

        if (edad < 13){
            System.out.println("Niño");
        } else if (edad < 18){
            System.out.println("Adolescente");
        }else if (edad < 65){
            System.out.println("Adulto");
        }else {
            System.out.println("Jubilado");
        }

    }
}
