public class buscarPrimerAprobado {
    public static void main(String[] args){
        String[] alumnos = {"Ana", "Luis", "Marta", "Pedro", "Lucia"};
        double[] notas = {7.5, 6.0, 9.2, 5.8, 8.7};

        int posicion = posicionPrimerAprobado(notas);

        if (posicion == -1) {
            System.out.println("No hay alumnos aprobados");
        }else {
            System.out.println("El primer alumno aprobado es " + alumnos[posicion] + " con una nota de " + notas[posicion]);
        }
    }
    public static int posicionPrimerAprobado(double[] notas){
        int posicionAprobado = -1;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                posicionAprobado = i;
                break;
            }
        }
        return posicionAprobado;
    }

}
