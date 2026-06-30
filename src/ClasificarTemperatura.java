public class ClasificarTemperatura {
    public static void main(String[] args) {
        double temperatura = 18.5;
        if (temperatura < 10) {
            System.out.println("Frío");
        } else if (temperatura < 25) {
            System.out.println("Templado");
        } else {
            System.out.println("Calor");
        }
    }
}
