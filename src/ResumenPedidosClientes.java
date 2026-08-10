public class ResumenPedidosClientes {
    public static void main(String[] args){
        String[] clientes = {"Ana", "Luis", "Marta", "Pedro", "Lucia"};
        double[] pedidos = {35.5, 80.0, 12.99, 120.0, 49.99};

        int posicionPedidoCaro = posicionPedidoMasCaro(pedidos);
        int posicionPedidoBajo = posicionPedidoMasBajo(pedidos);

        System.out.println("El cliente con el pedido mas caro es "+ clientes[posicionPedidoCaro]+ " con un importe de "+pedidos[posicionPedidoCaro]+ " Euros");
        System.out.println("El cliente con el pedido mas bajo es "+ clientes[posicionPedidoBajo]+ " con un importe de "+pedidos[posicionPedidoBajo]+ " Euros");
    }
    public static int posicionPedidoMasCaro(double[] pedidos){
        double pedidoMasCaro = pedidos[0];
        int posicionPedidoCaro = 0;
        for (int i = 1; i < pedidos.length; ++i){
            if (pedidos[i] > pedidoMasCaro){
                pedidoMasCaro = pedidos[i];
                posicionPedidoCaro = i;
            }
        }
        return posicionPedidoCaro;
    }
    public static int posicionPedidoMasBajo(double[] pedidos){
        double pedidoBajo = pedidos[0];
        int posicionBajo = 0;
        for (int i = 1; i < pedidos.length; ++i){
            if (pedidos[i] < pedidoBajo){
                pedidoBajo = pedidos[i];
                posicionBajo = i;
            }

        }
        return posicionBajo;
    }
}
