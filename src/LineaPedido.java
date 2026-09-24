public class LineaPedido {
    private Producto producto;
    private int unidades;

    public LineaPedido(Producto producto, int unidades){
        this.producto = producto;
        this.unidades = unidades;
    }
    public double calcularImporteLinea(){
        return this.unidades * this.producto.getPrecio();
    }
    public int getUnidades(){
        return this.unidades;
    }
    public Producto getProducto(){
        return this.producto;
    }
}

