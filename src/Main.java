public class Main {
    public static void main(String[] args) {
        String nombre = "Enric";
        double altura = 1.75;
        int edad = 36;
        System.out.println("Soy "+ nombre + ", Tengo " + edad + " años, y mido " + altura + " metros.");

        double precio = 12.5;
        int cantidad = 3;
        double total = precio * cantidad;
        System.out.println("El precio total es: " + total);

        double numero1 = 10.0;
        int numero2 = 3;
        System.out.println( numero1 / numero2);

        boolean esMayorDeEdad = edad >= 18;
        System.out.println( esMayorDeEdad );

        if (esMayorDeEdad) {
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }

        if (edad < 18) {
            System.out.println("Menor de edad");
        }else if (edad < 65) {
            System.out.println("Adulto");
        }else {
            System.out.println("Jubilado");
        }

    }
}
