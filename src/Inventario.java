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
    public double calcularPrecioStockTotal(){
        double precioStockTotal = 0;
        for (int i = 0; i < this.productos.length; i++){
            precioStockTotal += productos[i].calcularPrecioTotal();
        }
        return precioStockTotal;
    }
    public int calcularUnidadesTotales(){
        int unidades = 0;
        for (int i = 0; i < this.productos.length; i++){
            unidades += this.productos[i].getCantidad();
        }
        return unidades;
    }
    public Producto calcularProductoConMasUnidades(){
       Producto productoConMasUnidades = this.productos[0];
       for (int i = 1; i < this.productos.length; i++){
           if (this.productos[i].getCantidad() > productoConMasUnidades.getCantidad()){
               productoConMasUnidades = this.productos[i];
           }
       }
       return productoConMasUnidades;
    }

    public Producto calcularProductoMayorValorStock(){
        Producto productoMayorValor = this.productos[0];
        for (int i = 1; i < this.productos.length; i++){
            if (this.productos[i].calcularPrecioTotal() > productoMayorValor.calcularPrecioTotal()){
                productoMayorValor = this.productos[i];
            }
        }
        return productoMayorValor;
    }
    public void mostrarProductosConStockBajo(int limite){
        for (int i = 0; i < this.productos.length; i++){
            if (this.productos[i].getCantidad() <= limite){
                System.out.println("Deberias pedir "+ this.productos[i].getNombre()+ ", solamente quedan " + this.productos[i].getCantidad()+" unidades en el Stock");
            }
        }
    }
}
