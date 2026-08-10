public class BriefingPedidosDia {
    public static void main(String[] args){
        double[] pedidos = {24.99, 80.0, 15.50, 120.0, 49.99, 65.0};

        double sumaPedidos = calcularSumaPedidos(pedidos);
        int pedidosConEnvio = contarPedidosEnvioGratis(pedidos);
        double pedidoMasCaro = calcularPedidoMasCaro(pedidos);
        int pedidosPequenos = calcularPedidosPequenos(pedidos);

        System.out.println("La suma de todos los pedidos es de "+ sumaPedidos +" Euros");
        System.out.println("La cantidad de pedidos con envio gratis es de "+ pedidosConEnvio);
        System.out.println("El pedido mas caro es de "+ pedidoMasCaro +" Euros");
        System.out.println("La cantidad de pedidos pequeños es de "+ pedidosPequenos);

    }
    public static double calcularSumaPedidos(double[] pedidos){
        double suma = 0;
        for (double pedido: pedidos){
            suma += pedido;
        }
        return suma;
    }
    public static int contarPedidosEnvioGratis(double[] pedidos){
        int contador = 0;
        for (double pedido: pedidos){
            if (pedido >= 50){
                contador += 1;
            }
        }
        return contador;
    }
    public static double calcularPedidoMasCaro(double[] pedidos){
        double pedidoAlto = pedidos[0];
        for (int i = 1; i < pedidos.length; ++i){
            if (pedidos[i] > pedidoAlto){
                pedidoAlto = pedidos[i];
            }
        }
        return pedidoAlto;
    }
    public static int calcularPedidosPequenos(double[] pedidos){
        int contador = 0;
        for (double pedido: pedidos){
            if (pedido < 30){
                contador += 1;
            }
        }
        return contador;
    }

}
