public class EstadisticasPrecios {
    public static void main(String[] args){
        double[] precios = {12.50, 35.99, 8.75, 22.00, 5.40, 49.90};

        System.out.println("La suma de todos los precios es: "+ calcularTotal(precios));
        System.out.println("Cantidad de productos caros: "+ contarProductosCaros(precios));
        System.out.println("El precio mas alto es: "+ buscarPrecioMasAlto(precios));
    }
    public static double calcularTotal(double[] precios){
        double suma = 0;
        for (double precio : precios){
            suma += precio;
        }
        return suma;
    }
    public static int contarProductosCaros(double[] precios){
        int contador = 0;
        for (double precio : precios){
            if (precio > 20){
                contador += 1;
            }
        }
        return contador;
    }
    public static double buscarPrecioMasAlto(double[] precios){
        double precioAlto = precios[0];
        for (double precio : precios){
            if (precio > precioAlto){
                precioAlto =  precio;
            }
        }
        return precioAlto;
    }
}
