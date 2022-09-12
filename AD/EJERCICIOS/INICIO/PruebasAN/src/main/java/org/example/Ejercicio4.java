package org.example;

import java.util.Scanner;

/**
 * Ejercicio 4
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/rain-41f57695/
 */
public class Ejercicio4
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

        int minGolpe = -1;
        int maxGolpe = -1;

        String[] datos = entrada.split(" ");

        int minHab = Integer.parseInt(datos[0]);
        int maxHab = Integer.parseInt(datos[1]);
        int puntosGolpe = Integer.parseInt(datos[2]);

        if (minHab>maxHab) {
            System.out.println("-1 -1");
        } else {
            for (int numGolpe = 1; numGolpe * puntosGolpe <= maxHab; ++numGolpe) {
                if (numGolpe * puntosGolpe >= minHab && numGolpe * puntosGolpe <= maxHab) {
                    if (minGolpe == -1) {
                        minGolpe = numGolpe;
                    }
                    maxGolpe = numGolpe;
                }
            }

            String resultado = String.valueOf(minGolpe) + " " + String.valueOf(maxGolpe);
            System.out.println(resultado);
        }
    }
}
