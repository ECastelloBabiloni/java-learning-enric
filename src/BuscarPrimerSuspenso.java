public class BuscarPrimerSuspenso {
    public static void main(String[] args){
        String[] alumnos = {"Ana", "Luis", "Marta", "Pedro", "Lucia"};
        double[] notas = {7.5, 6.0, 9.2, 5.8, 8.7};

        int posicion = posicionPrimerSuspendido(notas);

        if (posicion == -1){
            System.out.println("No hay alumnos suspendidos");
        } else {
            System.out.println("El primer alumno suspendido es " + alumnos[posicion] + " con una nota de " + notas[posicion]);
        }

    }
    public static int posicionPrimerSuspendido(double[] notas){
        int primerSuspendido = -1;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] < 5){
                primerSuspendido = i;
                break;
            }
        }
        return primerSuspendido;
    }
}
