import java.util.Scanner;
public class DescuentoCompra {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Subtotal de la cuenta: ");
        double subTotal = teclado.nextDouble();

        System.out.println("El precio total del pedido es:" + calcularPrecioFinal(subTotal) + "Euros");
    }



    public static boolean tieneDescuento(double subTotal){
        return subTotal >= 100;
    }
    public static double calcularPrecioFinal(double subTotal){
        double descuento;
        double calcularPrecioFinal;

        if (tieneDescuento(subTotal)){
            descuento = subTotal * 0.1;
            calcularPrecioFinal = subTotal - descuento;
        } else{
            calcularPrecioFinal = subTotal;
        }
        return calcularPrecioFinal;
    }
}
