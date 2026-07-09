public class EstadisticasNotas {
    public static void main(String[] args){
        double[] notas = {7, 4, 9, 5, 3, 8};

        System.out.println("La suma de las notas es: "+ calcularSuma(notas));
        System.out.println("La nota media es: "+ calcularMedia(notas));
        System.out.println("La cantidad de aprobados es: "+ calcularAprobados(notas));
    }
    public static double calcularSuma(double[] notas){
        double suma = 0;
        for (double nota : notas){
            suma += nota;
        }
        return suma;
    }
    public static double calcularMedia(double[] notas){

        return calcularSuma(notas) / notas.length;
    }
    public static int calcularAprobados(double[] notas){
        int aprobados = 0;
        for (double nota : notas){
            if (nota >= 5){
                aprobados += 1;
            }
        }
        return aprobados;
    }

}
