import java.util.Scanner;
public class TiendaApp {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // PROVEEDORES

        Proveedor babiloni = new Proveedor("Babiloni", "Borriol");
        Proveedor fMarisa = new Proveedor("FrutasMarisa","Castellon");

        // PRODUCTOS

        Producto harina = new Producto("Harina",2.5,3,babiloni);
        Producto tomate = new Producto("Tomate", 1.2,4,fMarisa);
        Producto aceite = new Producto("Aceite", 9.2,5,babiloni);

        //Array tiendaApp e Inventario

        Producto[] productosTiendaApp = {harina, tomate, aceite};
        Inventario inventarioTiendaApp = new Inventario(productosTiendaApp);

        // INPUT?

        inventarioTiendaApp.mostrarProductosConProveedor();
        System.out.println("¿Que producto estas buscando?");
        String nombreBuscado = teclado.nextLine();

        // LLAMADAS

        Producto productoBuscado = inventarioTiendaApp.buscarProductoPorNombre(nombreBuscado);

        if (productoBuscado != null){
            System.out.println("El proveedor de "+ productoBuscado.getNombre() +" es " + productoBuscado.getProveedor().getNombre());
            System.out.println("El precio del producto "+ productoBuscado.getNombre() +" es de  " + productoBuscado.getPrecio()+ " Euros, y tenemos "+productoBuscado.getCantidad()+ " unidades en el Stock");
            // VENTAS
            System.out.println("¿Cuantas unidades quiere comprar?");
            int vender = teclado.nextInt();

            if (productoBuscado.venderUnidades(vender)){
                System.out.println("La compra se ha realizado correctamente, ahora quedan " + productoBuscado.getCantidad()+ " unidades de "+ productoBuscado.getNombre());
            }else{
                if (vender > 0){
                    System.out.println("No hay stock suficiente");
                }else{
                    System.out.println("Las unidades introducidas han de ser mayores que 0");
                }

            }
        }else{
            System.out.println("Producto no encontrado");
        }




    }
}
