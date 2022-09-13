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

        // Obtenemos cuantos casos de prueba hay
        String numCasos = s.nextLine();

        // Recorremos uno a uno los casos de prueba
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

        // Calculamos golpes necesarios para rango minimo
        double f = (double) minHab / puntosGolpe;
        long min = (long) Math.ceil(f);

        // Calculamos golpes necesarios para rango maximo
        long max = maxHab / puntosGolpe;

        // Imprimimos minimo y maximo si es posible
        if (min<=max){
            System.out.print(min + " ");
            System.out.print(max + "\n");
        }
        else {
            if (min>max) {
                System.out.print("-1 -1\n");
            }
        }
    }

}
