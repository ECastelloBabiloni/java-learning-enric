public class AlumnoMejorNota {
    public static void main(String[] args){
        String[] alumnos = {"Ana", "Luis", "Marta", "Pedro", "Lucia"};
        double[] notas = {7.5, 6.0, 9.2, 5.8, 8.7};

        int posicionNotaMasAlta = buscarPosicionNotaMasAlta(notas);
        int posicionNotaMasBaja = buscarPosicionNotaMasBaja(notas);

        System.out.println("La nota mas alta es de "+ alumnos[posicionNotaMasAlta] + " con una nota de "+ notas[posicionNotaMasAlta]);
        System.out.println("La nota mas baja es de "+ alumnos[posicionNotaMasBaja] + " con una nota de "+ notas[posicionNotaMasBaja]);
    }
    public static int buscarPosicionNotaMasAlta(double[] notas){
        int posicionAlta = 0;
        double notaAlta = notas[0];

        for (int i = 1; i < notas.length; i++){
            if(notas[i] > notaAlta){
                notaAlta = notas[i];
                posicionAlta = i;
            }
        }
        return posicionAlta;
    }
    public static int  buscarPosicionNotaMasBaja(double[] notas){
        int posicionBaja = 0;
        double notaBaja = notas[0];

        for (int i = 1; i < notas.length; i++){
            if(notas[i] < notaBaja){
                notaBaja = notas[i];
                posicionBaja = i;
            }
        }
        return posicionBaja;
    }

}
