import java.util.Scanner;
public class CalcularIVA {
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Escribe el precio sin IVA");
        double precio = teclado.nextDouble();

        System.out.println("El importe del IVA es: " + precioIVA(precio));
        System.out.println("El precio total con IVA es :" + precioTotalConIva(precio));
    }
    public static double precioIVA(double precio){
        double iva = precio * 0.21;
        return iva;
    }
    public static double precioTotalConIva(double precio){
        double total = precio + precioIVA(precio);
        return total;
    }
}
