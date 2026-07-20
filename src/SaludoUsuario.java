import java.util.Scanner;
public class SaludoUsuario {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = teclado.nextLine();

        System.out.println(saludar(nombre));

    }
    public static String saludar(String nombre){
        String saludo = "hola "+ nombre;
        return saludo;
    }
}
