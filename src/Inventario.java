public class Inventario {
    private Producto[] productos;
    public Inventario(Producto[] productos){
        this.productos = productos;
    }
    public int cantidadProductos(){
        return this.productos.length;
    }
}
