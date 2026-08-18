public class BriefingClientesTienda {
    public static void main(String[] args){
        String[] clientes = {"Ana", "Luis", "Marta", "Pedro", "Lucia", "Sofia"};
        double[] compras = {45.0, 120.0, 15.5, 80.0, 200.0, 33.0};

        double totalVendido = calcularTotalVentas(compras);
        int posicionMasCaro = calcularPosicionCompraMasGrande(compras);
        int posicionMasBaja = calcularPosicionCompraMasPequena(compras);
        int numeroDeVIPs = calcularCuantosVIP(compras);

        System.out.println("El total de ventas asciende a "+ totalVendido + " Euros");
        System.out.println("El cliente que mas ha comprado ha sido " + clientes[posicionMasCaro] + " y ha gastado "+ compras[posicionMasCaro]+ " Euros");
        System.out.println("El cliente que menos ha comprado ha sido " + clientes[posicionMasBaja] + " y ha gastado "+ compras[posicionMasBaja]+ " Euros");
        System.out.println("El numero de clientes VIP ha sido " + numeroDeVIPs);

        if (hayVentaBaja(compras)){
            System.out.println("Hay compras bajas");
        }else{
            System.out.println("No hay compras bajas");
        }

    }
    public static double calcularTotalVentas(double[] compras){
        double suma = 0;
        for (double compra: compras){
            suma += compra;
        }
        return suma;
    }
    public static int calcularPosicionCompraMasGrande(double[] compras){
        double compraGrande = compras[0];
        int posicion = 0;

        for (int i = 1; i < compras.length; ++i){
            if (compras[i] > compraGrande){
                compraGrande = compras[i];
                posicion = i;
            }
        }
        return posicion;
    }
    public static int calcularPosicionCompraMasPequena(double[] compras){
        double compraPequena = compras[0];
        int posicion = 0;

        for (int i = 1; i < compras.length; ++i){
            if (compras[i] < compraPequena){
                compraPequena = compras[i];
                posicion = i;
            }
        }
        return posicion;

    }
    public static int calcularCuantosVIP(double[] compras){
        int contador = 0;
        for (double compra: compras){
            if (compra >= 100){
                contador += 1;
            }
        }
        return contador;
    }
    public static boolean hayVentaBaja(double[] compras){
        for (double compra: compras){
            if (compra < 20){
                return true;
            }
        }
        return false;
    }
}
