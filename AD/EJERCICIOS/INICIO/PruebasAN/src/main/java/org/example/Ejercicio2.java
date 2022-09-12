package org.example;

import java.util.Scanner;

/**
 * Ejercicio 2
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/supernatural-cac54bc7/
 */
public class Ejercicio2
{
    public static void main(String args[] ) throws Exception {
        int numAmigos = 0;
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();

        numAmigos = comprobarAmigos(entrada);

        System.out.println(numAmigos);
    }

    public static int comprobarAmigos(String entrada) {

        int resultado = 0;

        for (int i = 1; i <= 9999999; ++i) {

            if (sonAmigos(entrada,String.valueOf(i))) {
                resultado++;
            }
        }

        return resultado;
    }

    public static boolean sonAmigos(String entrada,String numero) {

        if (numero.contains("1")) {
            return false;
        }

        int producto = 1;
        int digito = 0;

        for (int i = 0; i <= numero.length()-1; ++i) {
            digito = Character.getNumericValue(numero.charAt(i));;
            producto = producto * digito;
        }

        if (producto == Integer.parseInt(entrada)) {
            return true;

        } else {
            return false;
        }
    }
}
