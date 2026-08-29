public class PrimerObjeto {
    public static void main(String[] args) {

        Producto harina = new Producto("harina", 2.50, 3);
        Producto tomate = new Producto("Tomate", 1.20, 4);

        System.out.println("El producto " + harina.getNombre() + " cuesta " + harina.getPrecio() + " Euros, y en la cesta hay " + harina.getCantidad() + " unidades");
        System.out.println("El producto " + tomate.getNombre() + " cuesta " + tomate.getPrecio() + " Euros, y en la cesta hay " + tomate.getCantidad() + " unidades");
        System.out.println("El precio total de " + tomate.getNombre() + " es de " + tomate.calcularPrecioTotal()+ " Euros");
        System.out.println("El precio total de " + harina.getNombre() + " es de " + harina.calcularPrecioTotal()+ " Euros");
        System.out.println("El total de la cesta asciende a " + (tomate.calcularPrecioTotal() + harina.calcularPrecioTotal()) + " Euros");

        System.out.println("El precio total de " + harina.getNombre() + " con un descuento del 10% es de " + harina.calcularPrecioConDescuento(10)+ " Euros");
        System.out.println("El precio total de " + harina.getNombre() + " con un descuento del 20% es de " + harina.calcularPrecioConDescuento(20)+ " Euros");



        System.out.println("El total del producto " + harina.getNombre() + " cuesta " + harina.calcularPrecioTotal() + " Euros, y en la cesta hay " + harina.getCantidad() + " unidades");
        harina.agregarUnidades(2);
        System.out.println("El total del producto " + harina.getNombre() + " cuesta " + harina.calcularPrecioTotal() + " Euros, y en la cesta hay " + harina.getCantidad() +  " unidades");

        System.out.println("El producto " + tomate.getNombre() + " cuesta " + tomate.getPrecio() + " Euros");
        tomate.cambiarPrecio(1.5);
        System.out.println("El producto " + tomate.getNombre() + " cuesta " + tomate.getPrecio() + " Euros");
        System.out.println("El total del producto " + tomate.getNombre() + " cuesta " + tomate.calcularPrecioTotal() + " Euros");

        if (harina.venderUnidades(2)){
            System.out.println("La venta ha sido realizada, ahora mismo quedan "+ harina.getCantidad() + " unidades de "+  harina.getNombre());
        }else{
            System.out.println("La venta NO ha sido posible, solo quedan "+ harina.getCantidad() + " unidades de "+ harina.getNombre());
        }
        if (harina.venderUnidades(10)){
            System.out.println("La venta ha sido realizada, ahora mismo quedan "+ harina.getCantidad() + " unidades de "+  harina.getNombre());
        }else{
            System.out.println("La venta NO ha sido posible, solo quedan "+ harina.getCantidad() + " unidades de "+ harina.getNombre());
        }

        if (tomate.cambiarPrecio(-2.3)){
            System.out.println("EL precio del "+ tomate.getNombre() + " es de " + tomate.getPrecio());
        }else{
            System.out.println("EL precio del "+ tomate.getNombre() + " no ha podido modificarse");
        }

        if (tomate.cambiarPrecio(2.5)){
            System.out.println("EL precio del "+ tomate.getNombre() + " es de " + tomate.getPrecio() + " Euros");
        }else{
            System.out.println("EL precio del "+ tomate.getNombre() + " no ha podido modificarse");
        }

        if (tomate.agregarUnidades(0)){
            System.out.println("La cantidad de "+ tomate.getNombre() + " es de " + tomate.getCantidad());
        }else{
            System.out.println("La cantidad de "+ tomate.getNombre() + " no ha podido modificarse");
        }

        if (tomate.agregarUnidades(3)){
            System.out.println("La cantidad de "+ tomate.getNombre() + " es de " + tomate.getCantidad());
        }else{
            System.out.println("La cantidad de "+ tomate.getNombre() + " no ha podido modificarse");
        }

    }
}
