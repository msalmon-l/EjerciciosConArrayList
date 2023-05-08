package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<String>();
        Scanner read = new Scanner(System.in);
        String theLongest;

        while (true)
        {
            System.out.println("Introduce la cadena de text o -1 para finalizar: ");
            String cadena = read.nextLine();
            if (cadena.equals("-1"))
                break;
            cadenas.add(cadena);
        }
        theLongest = cadenaMasLarga(cadenas);
        System.out.println(theLongest);
    }
    public static String cadenaMasLarga(ArrayList<String> cadenas) {
        String Longest = "";
        for (String i: cadenas) {
            if (i.length() > Longest.length())
                Longest = i;
        }
        return Longest;
    }

}