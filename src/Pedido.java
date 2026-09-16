public class Pedido {
    private double importeTotal;

    public Pedido(){
        this.importeTotal = 0;
    }
    public boolean agregarImporte(double importeVenta){
        if (importeVenta >0){
            this.importeTotal += importeVenta;
            return true;
        }else{
            return false;
        }

    }
    public double getImporteTotal(){
        return this.importeTotal;
    }
    public double calcularTotalConDescuento(double porcentajeDescuento){
        return this.importeTotal - (this.importeTotal * (porcentajeDescuento /100));
    }
}
