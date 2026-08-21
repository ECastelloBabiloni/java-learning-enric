public class Producto{
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularPrecioTotal(){
         return this.precio * this.cantidad;
    }
    public double calcularPrecioConDescuento(double porcentajeDescuento){
        double precioTotal = this.calcularPrecioTotal();
        double descuento = porcentajeDescuento * precioTotal / 100;
        return precioTotal - descuento;
    }
    public void agregarUnidades(int unidadesAñadidas){
        this.cantidad = this.cantidad +unidadesAñadidas;
    }
    public void cambiarPrecio(double preciModificado){
        this.precio = preciModificado;
    }
    public boolean venderUnidades(int vender){
        if (this.cantidad < vender){
            return false;
        }else{
            this.cantidad = this.cantidad - vender;
            return true;
        }
    }
}
