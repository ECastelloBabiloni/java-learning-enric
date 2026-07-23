import java.util.Scanner;
public class CalculadoraCompraSimple {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Precio de la cuenta");
        double cuenta = teclado.nextDouble();

        System.out.println("Descuento aplicado:");
        double descuento = teclado.nextDouble();

        double iva = 0.21;
        double precioTrasDescuento = calcularPrecioTrasDescuento(cuenta, descuento);
        double importeIVA = calcularIVA(precioTrasDescuento, iva);

        System.out.println("El precio final de la cuenta es de "+ calcularPrecioFinal(precioTrasDescuento,importeIVA) + " Euros");
        System.out.println("Se han descontado  "+ calcularDescuento(cuenta, descuento) + " Euros");
        System.out.println("El importe del IVA "+ importeIVA + " Euros");

    }
    public static double calcularDescuento(double cuenta, double descuento){
        double importeDescuneto = cuenta * (descuento / 100);
        return importeDescuneto;
    }
    public static double calcularPrecioTrasDescuento(double cuenta, double descuento){
        double precioDescontado = cuenta - calcularDescuento(cuenta, descuento);
        return precioDescontado;
    }
    public static double calcularIVA(double precioTrasDescuento ,double iva){
        double importeIVA = precioTrasDescuento * iva;
        return importeIVA;
    }
    public static double calcularPrecioFinal(double precioTrasDescuento, double importeIVA){
        double total = precioTrasDescuento + importeIVA;
        return total;
    }
}
