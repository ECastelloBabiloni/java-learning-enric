import java.util.Scanner;
public class CalculadoraDescuentoConDefecto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Importe a pagar:");
        double importe = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Descuento a aplicar (10):");
        String inputDescuento = teclado.nextLine();
        double descuento;
        if (inputDescuento.isEmpty()){
            descuento = 10;
        }else{
            descuento = Double.parseDouble(inputDescuento);
        }
        double importeDescuento = calcularDescuento(descuento, importe);
        double totalConDescuento = calcularTotalConDescuento(importeDescuento, importe);

        System.out.println("El descuento a aplicar es de "+ Math.round(importeDescuento) + " Euros");
        System.out.println("El precio total con el descuento aplicado es de "+ totalConDescuento + " Euros");

    }
    public static double calcularDescuento(double descuento,double importe){
        double decimalDescuento = descuento / 100;
        double descuentoMonetario = decimalDescuento * importe;
        return descuentoMonetario;
    }
    public static double calcularTotalConDescuento(double importeDescuento, double importe){
        double total = importe - importeDescuento;
        return total;
    }
}
