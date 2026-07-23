import java.util.Scanner;
public class CalculadoraMasaPizzaJava {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero de comensales");
        int comensales = teclado.nextInt();
        System.out.println("Cantidad de masa en gramos por persona (320)");
        int gramosMasa = teclado.nextInt();
        System.out.println("Hidratacion de la masa");
        double inputHidratacion = teclado.nextDouble();
        System.out.println("Porcentaje de Sal (2%)");
        double inputSal = teclado.nextDouble();

        double porcentajeHidratacion = inputHidratacion / 100;
        double porcentajeSal = inputSal / 100;
        int pesoTotalMasa = calcularPesoTotal(comensales, gramosMasa);
        double harina = calcularHarina(pesoTotalMasa, inputHidratacion, inputSal);
        double agua = calcularAgua(harina, porcentajeHidratacion);
        double sal = calcularSal(harina, porcentajeSal);

        System.out.println("El peso total de la masa es: "+ pesoTotalMasa+ "g");
        System.out.println("Harina: " + Math.round(harina) + "g");
        System.out.println("Agua: " + Math.round(agua) + "g");
        System.out.println("Sal: " + Math.round(sal) + "g");

    }
    public static int calcularPesoTotal(int comensales, int gramosMasa){
        int pesoTotal = comensales * gramosMasa;
        return pesoTotal;
    }
    public static double calcularHarina(int pesoTotalMasa, double inputHidratacion, double inputSal){
        double porcentajeTotal = 100 + inputHidratacion + inputSal;
        double harina = pesoTotalMasa * 100 / porcentajeTotal;
        return harina;
    }
    public static double calcularAgua (double harina, double porcentajeHidratacion){
        double agua = porcentajeHidratacion * harina;
        return agua;
    }
    public static double calcularSal(double harina, double porcentajeSal){
        double sal = harina * porcentajeSal;
        return sal;
    }

}
