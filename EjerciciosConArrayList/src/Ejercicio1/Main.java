package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Double> alumnos = new ArrayList<Double>();
        double sumaAlturas = 0;
        double alturaMedia;

        double readed = 0.0;
        //ejercicio 1
        while (true)
        {
            System.out.println("Introduce la altura del alumno o si no -1 para salir: ");
            readed = read.nextDouble();
            if (readed == -1)
                break;
            alumnos.add(readed);
            sumaAlturas += readed;
        }
        alturaMedia = sumaAlturas / alumnos.size();
        System.out.println(alturaMedia);
        //ejercicio 2



    }

}