package org.example;

import java.util.Scanner;

/**
 * Ejercicio 4
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/rain-41f57695/
 */
public class Ejercicio4Opt
{
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String numCasos = s.nextLine();

        for (int i = 1; i <= Integer.parseInt(numCasos); ++i) {
            String entrada = s.nextLine();
            comprobarRango(entrada);
        }
    }

    public static void comprobarRango(String entrada) {

        long minGolpe = -1;
        long maxGolpe = -1;

        String[] datos = entrada.split(" ");

        long minHab = Long.parseLong(datos[0]);
        long maxHab = Long.parseLong(datos[1]);
        long puntosGolpe = Long.parseLong(datos[2]);

        double f = (double) minHab / puntosGolpe;
        long g = maxHab / puntosGolpe;

        if (f<=g){
            System.out.print((long) Math.ceil(f) + " ");
            System.out.print(g + "\n");
        }
        else {
            if (f>g) {
                System.out.print("-1 -1\n");
            }
        }
    }

}
