package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static double getMayoresMedia(ArrayList<Double> list, double media) {
        double mayoresMedia = 0;
        for (double i: list){
            if(i > media)
                mayoresMedia++;
        }
        return mayoresMedia;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> alumnos = new ArrayList<Double>();
        double sumaAlturas = 0;
        double alturaMedia;
        double mayoresMedia;

        double readed = 0.0;
        while (true)
        {
            System.out.println("Introduce la altura del alumno o si no -99 para salir: ");
            readed = read.nextDouble();
            if (readed == -99)
                break;
            alumnos.add(readed);
            sumaAlturas += readed;
        }
        alturaMedia = sumaAlturas / alumnos.size();
        mayoresMedia = getMayoresMedia(alumnos, alturaMedia);
        System.out.println("la suma total de altura es: " + sumaAlturas + "\n" +
                "la media es: " + alturaMedia + "\n" +
                "la cantidad de alumnos mayores a la media es: " + mayoresMedia);
    }

}