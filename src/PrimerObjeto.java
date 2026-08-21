public class PrimerObjeto {
    public static void main(String[] args) {

        Producto harina = new Producto("harina", 2.50, 3);
        Producto tomate = new Producto("Tomate", 1.20, 4);

        System.out.println("El producto " + harina.nombre + " cuesta " + harina.precio + " Euros, y en la cesta hay " + harina.cantidad + " unidades");
        System.out.println("El producto " + tomate.nombre + " cuesta " + tomate.precio + " Euros, y en la cesta hay " + tomate.cantidad + " unidades");
        System.out.println("El precio total de " + tomate.nombre + " es de " + tomate.calcularPrecioTotal()+ " Euros");
        System.out.println("El precio total de " + harina.nombre + " es de " + harina.calcularPrecioTotal()+ " Euros");
        System.out.println("El total de la cesta asciende a " + (tomate.calcularPrecioTotal() + harina.calcularPrecioTotal()) + " Euros");

        System.out.println("El precio total de " + harina.nombre + " con un descuento del 10% es de " + harina.calcularPrecioConDescuento(10)+ " Euros");
        System.out.println("El precio total de " + harina.nombre + " con un descuento del 20% es de " + harina.calcularPrecioConDescuento(20)+ " Euros");



        System.out.println("El total del producto " + harina.nombre + " cuesta " + harina.calcularPrecioTotal() + " Euros, y en la cesta hay " + harina.cantidad + " unidades");
        harina.agregarUnidades(2);
        System.out.println("El total del producto " + harina.nombre + " cuesta " + harina.calcularPrecioTotal() + " Euros, y en la cesta hay " + harina.cantidad +  " unidades");

        System.out.println("El producto " + tomate.nombre + " cuesta " + tomate.precio + " Euros");
        tomate.cambiarPrecio(1.5);
        System.out.println("El producto " + tomate.nombre + " cuesta " + tomate.precio + " Euros");
        System.out.println("El total del producto " + tomate.nombre + " cuesta " + tomate.calcularPrecioTotal() + " Euros");

        if (harina.venderUnidades(2)){
            System.out.println("La venta ha sido realizada, ahora mismo quedan "+ harina.cantidad + " unidades de "+  harina.nombre);
        }else{
            System.out.println("La venta NO ha sido posible, solo quedan "+ harina.cantidad + " unidades de "+ harina.nombre);
        }
        if (harina.venderUnidades(10)){
            System.out.println("La venta ha sido realizada, ahora mismo quedan "+ harina.cantidad + " unidades de "+  harina.nombre);
        }else{
            System.out.println("La venta NO ha sido posible, solo quedan "+ harina.cantidad + " unidades de "+ harina.nombre);
        }


    }
}
