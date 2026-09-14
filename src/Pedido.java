public class Pedido {
    private double importeTotal;

    public Pedido(){
        this.importeTotal = 0;
    }
    public void agregarImporte(double importeVenta){
        this.importeTotal += importeVenta;
    }
    public double getImporteTotal(){
        return this.importeTotal;
    }
}
