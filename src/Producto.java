public class Producto{
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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
        if (this.cantidad < vender){
            return false;
        }else{
            this.cantidad = this.cantidad - vender;
            return true;
        }
    }
}
