import java.util.Scanner;
public class CalculadoraEnvioConDefecto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor del importe");
        double importe = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Gastos de envio (5)");
        String inputEnvio = teclado.nextLine();

        double envio;

        if (inputEnvio.isEmpty()){
            envio = 5;
        }else{
            envio = Double.parseDouble(inputEnvio);
        }

        double envioCalculado = calcularEnvio(importe, envio);
        double precioTotal = precioConEnvio(importe, envioCalculado);

        System.out.println("El precio del envio es de "+ envioCalculado + " Euros");
        System.out.println("El precio total con el envio incluido es de "+ precioTotal + " Euros");
    }
    public static double calcularEnvio(double importe, double envio){
        if (importe >= 50){
            envio = 0;
        }
        return envio;
    }
    public static double precioConEnvio(double importe, double envioCalculado){

        double total = envioCalculado + importe;
        return total;
    }
}
