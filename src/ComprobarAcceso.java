import java.util.Scanner;
public class ComprobarAcceso {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Edad: ");
        int edad = teclado.nextInt();

        if (admitido(edad)){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado");
        }

    }
    public static boolean admitido(int edad){
        return edad >= 18;
    }
}
