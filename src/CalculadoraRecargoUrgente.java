import java.util.Scanner;
    public class CalculadoraRecargoUrgente {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Importe del pedido: ");
            double importe = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Es urgente s/n (n)");
            String inputUrgente = teclado.nextLine();
            boolean urgente;

            if (inputUrgente.equals("s")){
                urgente = true;
            }else{
                urgente = false;
            }

            double recargo = calcularRecargo(importe, urgente);
            double totalConRecargo = calcularTotalConRecargo(importe,recargo);

            System.out.println("El importe del recargo es de "+ recargo +" Euros");
            System.out.println("El importe total con el recargo es de "+ totalConRecargo +" Euros");

        }
        public static double calcularRecargo (double importe, boolean urgente){
            double recargo;
            if (urgente){
                recargo = importe * 0.15;
            }else {
                recargo = 0;
            }
            return recargo;
        }
        public static double calcularTotalConRecargo(double importe, double recargo){
            double total = importe + recargo;
            return total;
        }


}
