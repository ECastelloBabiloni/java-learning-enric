import java.util.ArrayList;
public class Pedido {
    private double importeTotal;
    private ArrayList<LineaPedido> lineas;

    public Pedido(){
        this.importeTotal = 0;
        this.lineas = new ArrayList<>();
    }
    public boolean agregarImporte(double importeVenta){
        if (importeVenta >0){
            this.importeTotal += importeVenta;
            return true;
        }else{
            return false;
        }

    }
    public void agregarLinea(LineaPedido linea){
        this.lineas.add(linea);
    }

    public double getImporteTotal(){

        return this.importeTotal;
    }

    public double calcularTotalConDescuento(double porcentajeDescuento){
        return this.importeTotal - (this.importeTotal * (porcentajeDescuento /100));
    }
    public void cestaCompra(){

        System.out.println("Cesta:");
        for (int i = 0; i < lineas.size(); ++i){
            LineaPedido lineaActual = lineas.get(i);
            System.out.printf("%s - %d unidades, total: %.2f Euros%n",
                    lineaActual.getProducto().getNombre(),
                    lineaActual.getUnidades(),
                    lineaActual.calcularImporteLinea()
                    );
        }
    }

}
