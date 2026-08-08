public class ResumenPedidos {
    public static void main(String[] args){
        double[] pedidos = {35.5, 80.0, 12.99, 120.0, 49.99};

        double totalPedido = calcularTotalPedidos(pedidos);
        int pedidosConEnvioGratis = contarPedidosConEnvioGratis(pedidos);
        double pedidoMasGrande = buscarPedidoMasCaro(pedidos);

        System.out.println("El total de los pedidos de la lista es: "+ totalPedido + " Euros");
        System.out.println("Total de pedidos con envio gratis es de "+ pedidosConEnvioGratis);
        System.out.println("El pedido con el importe mas alto es de: "+ pedidoMasGrande + " Euros");
    }
    public static double calcularTotalPedidos(double[] pedidos){
        double suma = 0;
        for (int i = 0; i < pedidos.length; ++i){
            suma += pedidos[i];
        }
        return suma;
    }
    public static int contarPedidosConEnvioGratis(double[] pedidos){
        int contador = 0;
        for (int i = 0; i < pedidos.length; ++i){
            if (pedidos[i] >= 50){
                contador += 1;
            }
        }
        return contador;
    }
    public static double buscarPedidoMasCaro(double[] pedidos){
        double pedidoMasCaro = pedidos[0];
        for (int i = 1; i < pedidos.length; ++i){
            if (pedidos[i] > pedidoMasCaro){
                pedidoMasCaro = pedidos[i];
            }
        }
        return pedidoMasCaro;
    }

}