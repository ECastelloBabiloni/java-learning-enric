public class BriefingNotasClase {
    public static void main(String[] args){
        double[] notas = {4.5, 7.0, 8.2, 3.9, 6.5, 9.0, 5.0};

        double notaMedia = calcularNotaMedia(notas);
        int numeroAlumnosAprobados = calcularNumeroAlumnosAprobados(notas);
        int numeroAlumnosSuspendidos = calcularNumeroAlumnosSuspendidos(notas);
        double notaMasAlta = calcularNotaMasAlta(notas);
        double notaMasBaja = calcularNotaMasBaja(notas);

        System.out.printf("La nota media de clase es de %.2f%n", notaMedia);
        System.out.println("El numero de alumnos aprobados es " + numeroAlumnosAprobados);
        System.out.println("El numero de alumnos suspendidos es " + numeroAlumnosSuspendidos);
        System.out.println("La nota mas alta de la clase es "+ notaMasAlta);
        System.out.println("La nota mas baja de la clase es "+ notaMasBaja);
    }
    public static double calcularNotaMedia (double[] notas){
        double sumaNotas = 0;
        for (double nota: notas){
            sumaNotas += nota;
        }
        double media = sumaNotas / notas.length;
        return media;
    }
    public static int calcularNumeroAlumnosAprobados(double[] notas){
        int contador = 0;
        for (double nota: notas){
            if (nota >= 5){
                contador += 1;
            }
        }
        return contador;
    }
    public static int calcularNumeroAlumnosSuspendidos(double[] notas){
        int contador = 0;
        for (double nota: notas){
            if (nota < 5){
                contador += 1;
            }
        }
        return contador;
    }
    public static double calcularNotaMasAlta(double[] notas){
        double notaAlta = notas[0];
        for (int i = 1; i < notas.length; ++i){
            if (notas[i] > notaAlta){
                notaAlta = notas[i];
            }
        }
        return notaAlta;
    }
    public static double calcularNotaMasBaja(double[] notas){
        double notaBaja = notas[0];
        for (int i = 1; i < notas.length; ++i){
            if (notas[i] < notaBaja){
                notaBaja = notas[i];
            }
        }
        return notaBaja;
    }

}
