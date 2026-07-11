public class ProductoMasCaroArrays {
    public static void main(String[] args) {
        String[] nombres = {"Harina", "Tomate", "Queso", "Aceite", "Levadura"};
        double[] precios = {2.50, 1.80, 4.75, 6.20, 0.90};

        int posicion = buscarPosicionPrecioMasAlto(precios);

        System.out.println("El articulo mas caro es "+ nombres[posicion] + " y vale " + precios[posicion] + " Euros");

    }
    public static int buscarPosicionPrecioMasAlto(double[] precios) {

        int posicionCaro = 0;
        double precioCaro = precios[0];

        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > precioCaro) {
                posicionCaro = i;
                precioCaro =  precios[i];
            }
        }
        return posicionCaro;
    }


}