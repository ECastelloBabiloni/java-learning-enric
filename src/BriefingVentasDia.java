public class BriefingVentasDia {
    public static void main(String[] args){
        double[] ventas = {45.0, 80.0, 25.5, 100.0, 12.0, 60.0};

        double ventasTotales = calcularVentasTotales(ventas);
        double ventaMasAlta = calcularVentaMasAlta(ventas);
        double media = calcularMedia(ventas, ventasTotales);
        int numeroDeVentasGrandes = calcularVentasGrandes(ventas);


        System.out.println("Las ventas totales de hoy ascienden a: "+ventasTotales + " Euros");
        System.out.println("La venta mas alta de hoy es de: "+ ventaMasAlta + " Euros");
        System.out.printf("La media de las ventas de hoy es: %.2f%n", media);
        System.out.println("El numero de ventas grandes que hemos tenido hoy son: "+ numeroDeVentasGrandes);

        if (esDiaBueno(ventasTotales)){
            System.out.println("Hoy ha sido un dia bueno");
        }else{
            System.out.println("Hoy ha sido un dia malo");
        }

    }
    public static double calcularVentasTotales(double[] ventas){
        double suma = 0;
        for (double venta: ventas){
            suma += venta;
        }
        return suma;
    }
    public static double calcularVentaMasAlta(double[] ventas){
        double masAlta = ventas[0];
        for (int i = 1; i < ventas.length; ++i){
            if (ventas[i] > masAlta){
                masAlta = ventas[i];
            }
        }
        return masAlta;
    }
    public static double calcularMedia(double[] ventas, double ventasTotales){
        double media = ventasTotales / ventas.length;
        return media;
    }
    public static int calcularVentasGrandes(double[] ventas){
        int contador = 0;
        for (double venta: ventas){
            if (venta >= 60){
                contador += 1;
            }
        }
        return contador;
    }
    public static boolean esDiaBueno(double ventasTotales){
        if (ventasTotales >= 300){
            return true;
        }else {
            return false;
        }
    }

}
