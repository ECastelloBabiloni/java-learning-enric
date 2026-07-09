public class RecorrerArray {
    public static void main(String[] args){
        int[] numeros = {4, 7, 2, 9};

        mostrarArray(numeros);
        System.out.println("El total de la suma es : " + sumarArray(numeros));
        System.out.println("El numero mas alto es: " + buscarMayor(numeros));
        System.out.println("El numero mas bajo es: " + buscarMenor(numeros));
    }
    public static int sumarArray(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }
    public static int buscarMayor(int[] numeros){
        int numeroMayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        return numeroMayor;
    }
    public static int buscarMenor(int[] numeros){
        int numeroMenor = numeros[0];
        for (int i = 1; i < numeros.length; i++){

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        return numeroMenor;
    }
    public static void mostrarArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++){

            System.out.println(numeros[i]);
        }
    }
}
