package org.example;

import java.util.Scanner;

/**
 * Ejercicio 3
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/excursion-2d080f3a/
 */
public class Ejercicio3
{
    public static void main(String args[] ) throws Exception {

        int numHabitaciones = 0;
        Scanner s = new Scanner(System.in);

        // Obtenemos cuantos casos de prueba hay
        String numCasos = s.nextLine();

        // Recorremos uno a uno los casos de prueba
        for (int i = 1; i <= Integer.parseInt(numCasos); ++i) {
            String entrada = s.nextLine();
            numHabitaciones = comprobarHabitaciones(entrada);
            System.out.println(numHabitaciones);
        }
    }

    public static int comprobarHabitaciones(String entrada) {

        int numHabitaciones = 0;
        String[] datos = entrada.split(" ");

        int numElfos = Integer.parseInt(datos[0]);
        int numOrcos = Integer.parseInt(datos[1]);
        int numCamas = Integer.parseInt(datos[2]);

        // Calculamos numero de habitaciones de elfos
        int habElfos = numElfos / numCamas;
        if (numElfos % numCamas != 0) {
            habElfos++;
        }

        // Calculamos numero de habitaciones de orcos
        int habOrcos = numOrcos / numCamas;
        if (numOrcos % numCamas != 0) {
            habOrcos++;
        }

        // Sumamos total de habitaciones necesarias
        return numHabitaciones = habElfos+habOrcos;
    }
}
