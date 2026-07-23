import java.util.Scanner;
public class CalcularPropina {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Importe de la cuenta :");
        double cuenta = teclado.nextDouble();
        System.out.println("Porcentaje de la propina: ");
        double propina = teclado.nextDouble();

        System.out.println("El importe de la propina es " + calcularPropina(cuenta, propina) + " Euros");
        System.out.println("El importe total es " + calcularTotalConPropina(cuenta, propina) + " Euros");
    }
    public static double calcularPropina(double cuenta, double propina){
        double importePropina = cuenta * (propina / 100);
        return importePropina;
    }
    public static double calcularTotalConPropina (double cuenta, double propina){
        double total = cuenta + calcularPropina(cuenta, propina);
        return total;
    }
}
