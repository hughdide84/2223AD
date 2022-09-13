package org.example;

import java.util.Scanner;

/**
 * Ejercicio 1
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
 */
public class Ejercicio1
{
    public static void main(String args[] ) throws Exception {

        boolean correcto = true;
        Scanner s = new Scanner(System.in);

        // Obtenemos entrada de datos
        String matricula = s.nextLine();

        // Comprobamos si el formato es valido
        correcto = comprobarFormato(matricula);

        // Comprobamos si la suma de digitos es valida
        if (correcto) {
            correcto = comprobarSumas(matricula);
        }

        // Si es correcto imprimimos valid en caso contrario invalid
        if (correcto) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    public static boolean comprobarFormato(String matricula) {

        // Verificamos que mida 9 la matricula
        if (matricula.length()!=9) {
            return false;
        }

        // Verificamos que la 3 posicion tenga una letra mayuscula
        if (!Character.isUpperCase(matricula.charAt(2))) {
            return false;
        }

        // Verificamos que la posicion 7 trae un guion
        if (matricula.charAt(6)!='-') {
            return false;
        }

        // Verificamos que no tenga las letras prohibidas
        if (matricula.contains("A") || matricula.contains("E") || matricula.contains("I") ||
            matricula.contains("O") || matricula.contains("U") || matricula.contains("Y")) {
            return false;
        }

        // Recorremos caracter a caracter, omitiendo la letra y el guion, verificando que son numeros
        for (int i = 0; i < 9; ++i) {
            if (i!=2 && i!=6) {
                if (!Character.isDigit(matricula.charAt(i))) {
                    return false;
                }
            }
        }

        // Si no ha fallado alguna validacion, el formato es correcto
        return true;
    }

    public static boolean comprobarSumas(String matricula) {

        // Almacenamos en variables cada digito
        int num0 = Character.getNumericValue(matricula.charAt(0));
        int num1 = Character.getNumericValue(matricula.charAt(1));
        int num3 = Character.getNumericValue(matricula.charAt(3));
        int num4 = Character.getNumericValue(matricula.charAt(4));
        int num5 = Character.getNumericValue(matricula.charAt(5));
        int num7 = Character.getNumericValue(matricula.charAt(7));
        int num8 = Character.getNumericValue(matricula.charAt(8));

        // Si la suma de los digitos consecutivos son impares sera invalida
        if((num0+num1) % 2 != 0) return false;
        if((num3+num4) % 2 != 0) return false;
        if((num4+num5) % 2 != 0) return false;
        if((num7+num8) % 2 != 0) return false;

        // Si no ha fallado alguna validacion, los digitos son correctos
        return true;
    }
}
