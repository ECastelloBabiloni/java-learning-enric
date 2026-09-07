public class Producto{
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;

    }

    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }

    public double calcularPrecioTotal(){
         return this.precio * this.cantidad;
    }
    public double calcularPrecioConDescuento(double porcentajeDescuento){
        double precioTotal = this.calcularPrecioTotal();
        double descuento = porcentajeDescuento * precioTotal / 100;
        return precioTotal - descuento;
    }
    public boolean agregarUnidades(int unidadesAñadidas){
        if (unidadesAñadidas > 0){
            this.cantidad = this.cantidad +unidadesAñadidas;
            return true;
        }else{
            return false;
        }
    }

    public boolean cambiarPrecio(double preciModificado){
        if (preciModificado > 0){
            this.precio = preciModificado;
            return true;
        }else{
            return false;
        }
    }
    public boolean venderUnidades(int vender){
        if (hayStockSuficiente(vender)){
            this.cantidad = this.cantidad - vender;
            return true;
        }else{
            return false;
        }
    }
    public boolean hayStockSuficiente(int unidadesSolicitadas){
        if (unidadesSolicitadas <= this.cantidad){
            return true;
        }else{
            return false;
        }
    }

}
