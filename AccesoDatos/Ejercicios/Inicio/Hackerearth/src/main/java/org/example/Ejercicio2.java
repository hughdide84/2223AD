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

        // Obtenemos entrada de datos
        String entrada = s.nextLine();

        // Comprobamos amigos de esa entrada
        numAmigos = comprobarAmigos(entrada);

        System.out.println(numAmigos);
    }

    public static int comprobarAmigos(String entrada) {

        int resultado = 0;

        // Para cada numero posible comprobamos el producto de sus digitos
        for (int i = 1; i <= 9999999; ++i) {

            // Si son amigos, incrementamos contador de amigos
            if (sonAmigos(entrada,String.valueOf(i))) {
                resultado++;
            }
        }

        return resultado;
    }

    public static boolean sonAmigos(String entrada,String numero) {

        // Si contiene 1 no son amigos
        if (numero.contains("1")) {
            return false;
        }

        int producto = 1;
        int digito = 0;

        // Recorremos los digitos y vamos acumulando el producto
        for (int i = 0; i <= numero.length()-1; ++i) {
            digito = Character.getNumericValue(numero.charAt(i));;
            producto = producto * digito;
        }

        // Si el producto coincide con la entrada son amigos, en caso contrario no
        if (producto == Integer.parseInt(entrada)) {
            return true;
        } else {
            return false;
        }
    }
}
