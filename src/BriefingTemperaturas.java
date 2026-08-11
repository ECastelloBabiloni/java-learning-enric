public class BriefingTemperaturas {
    public static void main(String[] args){
        double[] temperaturas = {3.5, 4.0, 7.2, 2.8, 5.5, 8.1, 3.9};

        double media = calcularMedia(temperaturas);
        double temperaturaMasAlta = calcularTemperaturaMasAlta(temperaturas);
        double temperaturaMasBaja = calcularTemperaturaMasBaja(temperaturas);
        int temperaturasLimiteSeguro = calcularTemperaturasLimiteSeguro(temperaturas);
        boolean respuesta = revisarTemperaturasCriticas(temperaturas);
        String hay;

        if (respuesta){
            hay = "Si";
        }else{
            hay = "No";
        }

        System.out.printf("La media de las temperaturas es de: %.2f%n", media);
        System.out.println("La temperatura mas alta es de: "+ temperaturaMasAlta);
        System.out.println("La temperatura mas baja es de: "+ temperaturaMasBaja);
        System.out.println("La cantidad de temperaturas por encima del limite seguro es de: "+ temperaturasLimiteSeguro);
        System.out.println( hay + " hay registros con temperaturas criticas");

    }
    public static double calcularMedia(double[] temperaturas){
        double sumaTemperaturas = 0;
        for (double temperatura: temperaturas){
            sumaTemperaturas += temperatura;
        }
        double media = sumaTemperaturas / temperaturas.length;
        return media;
    }
    public static double calcularTemperaturaMasAlta(double[] temperaturas){
        double masAlta = temperaturas[0];
        for (int i = 1; i < temperaturas.length; ++i){
            if (temperaturas[i] > masAlta){
                masAlta = temperaturas[i];
            }
        }
        return masAlta;
    }
    public static double calcularTemperaturaMasBaja(double[] temperaturas){
        double masBaja = temperaturas[0];
        for (int i = 1; i < temperaturas.length; ++i){
            if (temperaturas[i] < masBaja){
                masBaja = temperaturas[i];
            }
        }
        return masBaja;
    }
    public static int calcularTemperaturasLimiteSeguro(double[] temperaturas){
        int contador = 0;
        for (double temperatura: temperaturas){
            if (temperatura > 5){
                contador += 1;
            }
        }
        return contador;
    }
    public static boolean revisarTemperaturasCriticas (double[] temperaturas){
        boolean hay = false;
        for (double temperatura: temperaturas){
            if (temperatura >= 8){
                hay = true;
                break;
            }
        }
        return hay;
    }
}
