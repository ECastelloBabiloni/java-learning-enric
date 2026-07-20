import java.util.Scanner;
public class BuscarAlumnoPorNombre {
    public static void main(String[] args){

        String[] alumnos = {"Ana", "Luis", "Marta", "Pedro", "Lucia"};
        double[] notas = {7.5, 6.0, 9.2, 5.8, 8.7};

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que alumno quieres buscar?");
        String buscarNombre = teclado.nextLine();

        int posicion = posicionAlumno(alumnos, buscarNombre);

        if (posicion == -1){
            System.out.println(buscarNombre + " no esta en la lista");
        } else {
            System.out.println("La posicion de " + buscarNombre + " en la lista es "+ posicion + ", y su nota es " + notas[posicion]);
        }


    }
    public static int posicionAlumno(String[] alumnos, String buscarNombre){

       int posicionNombre = -1;
       for (int i = 0; i < alumnos.length; i++){
           if (alumnos[i].equals(buscarNombre)){
               posicionNombre = i;
               break;
           }
       }
       return posicionNombre;
    }
}
