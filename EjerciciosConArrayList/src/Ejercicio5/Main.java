package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<EquiposFutbol> Champions = new ArrayList<EquiposFutbol>();
        Scanner read = new Scanner(System.in);

        while (true)
        {
            System.out.println("Introduce el nombre del equipo: ");
            String nombre = read.nextLine();

            System.out.println("Introduce el nombre del estadio: ");
            String Estadio = read.nextLine();
            System.out.println("Introduce en que liga pertenece: ");
            String liga = read.nextLine();
            Champions.add(new EquiposFutbol(nombre, Estadio, liga));
            System.out.println("Introduce cualquier letra para añadir otro equipo o 'salir' para salir: ");
            String continuar = read.nextLine();
            if (continuar.equals("salir"))
                break;
        }
        System.out.println(Champions);
    }
}