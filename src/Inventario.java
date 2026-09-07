public class Inventario {
    private Producto[] productos;
    public Inventario(Producto[] productos){
        this.productos = productos;
    }
    public int cantidadProductos(){
        return this.productos.length;
    }
    public void mostrarProductosConProveedor(){

        for (int i = 0; i < this.productos.length; i++){
            System.out.println(productos[i].getNombre() + " - proveedor: "+ productos[i].getProveedor().getNombre());

        }

    }
}
