import java.util.Scanner;
public class CalcularDescuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precio del producto: ");
        double precio = teclado.nextDouble();
        System.out.println("Descuento a aplicar: ");
        double descuento = teclado.nextDouble();

        System.out.println("Hay un descuento de " + calcularDescuento(precio,descuento) + " Euros");
        System.out.println("El precio total con el descuento es de " + calcularPrecioFinal(precio,descuento) + " Euros ");
    }

    public static double calcularDescuento(double precio, double descuento) {
        double importeDescuento = precio * (descuento / 100);
        return importeDescuento;
    }

    public static double calcularPrecioFinal(double precio, double descuento) {
        double total = precio - calcularDescuento(precio, descuento);
        return total;
    }
}