import java.util.Scanner;
public class ValorPorDefecto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Gramos por persona?");
        String inputGramos = teclado.nextLine();

        int gramosPorPersona;

        if (inputGramos.isEmpty()){
            gramosPorPersona = 350;
        }else{
            gramosPorPersona = Integer.parseInt(inputGramos);
        }

        System.out.println(gramosPorPersona);
    }
}
