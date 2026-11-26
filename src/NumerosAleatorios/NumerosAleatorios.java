/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosAleatorios;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mañana
 */
public class NumerosAleatorios {

    public static void main(String[] args) {
        /*
         //--------------------Ejercicio 1 (6.3)--------------------\\
         System.out.println("Ejercicio 1");

        int dado1 = (int) (Math.random() * 6 + 1); // número aleatorio entre 1 y 6
        int dado2 = (int) (Math.random() * 6 + 1);
        int dado3 = (int) (Math.random() * 6 + 1);

        int suma = dado1 + dado2 + dado3;

        System.out.println("Tirada de tres dados:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        System.out.println("Suma total: " + suma);

        //--------------------Ejercicio 2 (6.3)--------------------\\
        System.out.println("Ejercicio 2");

        int numPalo = (int) (Math.random() * 4);     // 0, 1, 2 o 3
        int numCarta = (int) (Math.random() * 13) + 1; // entre 1 y 13

        String palo;
        String carta;

        // Elegimos el palo
        switch (numPalo) {
            case 0:
                palo = "picas";
                break;
            case 1:
                palo = "corazones";
                break;
            case 2:
                palo = "diamantes";
                break;
            default:
                palo = "treboles";
        }

        // Elegimos la carta (el 1 es el As)
        switch (numCarta) {
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numCarta); // del 2 al 10
        }

        System.out.println("Carta: " + carta + " de " + palo);

        //--------------------Ejercicio 3 (6.3)--------------------\\
        System.out.println("Ejercicio 3");

        int numPalo = (int) (Math.random() * 4);     // 0, 1, 2 o 3
        int numCarta = (int) (Math.random() * 12) + 1; // 

        String palo;
        String carta;

        // Elegimos el palo
        switch (numPalo) {
            case 0:
                palo = "Oro";
                break;
            case 1:
                palo = "Espada";
                break;
            case 2:
                palo = "Copa";
                break;
            default:
                palo = "Basto";
        }

        // Elegimos la carta (el 1 es el As)
        switch (numCarta) {
            case 1:
                carta = "AS";
                break;
            case 10:
                carta = "Caballo";
                break;
            case 11:
                carta = "Sota";
                break;
            case 12:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(numCarta); // del 2 al 10
        }

        System.out.println("Carta: " + carta + " de " + palo);

        //--------------------Ejercicio 4 (6.3)--------------------\\
        System.out.println("Ejercicio 4");

        System.out.println("Los 20 numeros son:");

        for (int i = 1; i <= 20; i++) {
            System.out.print((int) (Math.random() * 11) + " ");
        }

        //--------------------Ejercicio 5 (6.3)--------------------\\
        System.out.println("Ejercicio 5");

        int maximo = 100; // min
        int minimo = 199;  // max
        int suma = 0;

        System.out.println("Los 50 numeros son: ");

        for (int i = 1; i <= 50; i++) {
            int numero = (int) (Math.random() * 100) + 100; // entre 100 y 199

            System.out.print(numero + " ");

            suma = suma + numero;

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double media = suma / 50.0;

        System.out.println();
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);

        //--------------------Ejercicio 6 (6.3)--------------------\\
        System.out.println("Ejercicio 6");

        Scanner s = new Scanner(System.in);

        // Número aleatorio entre 0 y 100, ambos incluidos
        int secreto = (int) (Math.random() * 101);

        int intentos = 5;
        boolean acertado = false;

        System.out.println("Adivina el numero entre 0 y 100.");
        System.out.println("Tienes 5 intentos.");

        while (intentos > 0 && !acertado) {
            System.out.print("Introduce un numero: ");
            int numero = s.nextInt();

            if (numero == secreto) {
                acertado = true;
                System.out.println("Has acertado");
            } else {
                intentos--;

                if (numero < secreto) {
                    System.out.println("El numero introducido es menor que el.");
                } else {
                    System.out.println("El numero introducido es mayor que el.");
                }

                System.out.println("Quedan " + intentos + " intentos.");
            }
        }

        if (!acertado) {
            System.out.println("0 intentos. El numero era " + secreto);
        }

        //--------------------Ejercicio 7 (6.3)--------------------\\
        System.out.println("Ejercicio 7");

        //--------------------Ejercicio 8 (6.3)--------------------\\
        System.out.println("Ejercicio 8");

        //--------------------Ejercicio 9 (6.3)--------------------\\
        System.out.println("Ejercicio 9");

        int numero;
        int contador = 0;

        do {
            numero = (int) (Math.random() * 51) * 2; // pares entre 0 y 100
            contador++;
            System.out.print(numero);
            System.out.println(" ");
        } while (numero != 24);

        System.out.println();
        System.out.println("Se han generado " + contador + " numeros.");

        //--------------------Ejercicio 10 (6.3)--------------------\\
        System.out.println("Ejercicio 10");

        for (int i = 0; i < 10; i++) {

            int numero = (int) (Math.random() * 6); // de 0-5
            char caracter = ' ';

            switch (numero) {
                case 0:
                    caracter = '*';
                    break;
                case 1:
                    caracter = '-';
                    break;
                case 2:
                    caracter = '=';
                    break;
                case 3:
                    caracter = '.';
                    break;
                case 4:
                    caracter = '|';
                    break;
                case 5:
                    caracter = '@';
                    break;
            }

            int longitud = (int) (Math.random() * 40) + 1; // de 1-40

            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

        //--------------------Ejercicio 11 (6.3)--------------------\\
        System.out.println("Ejercicio 11");

        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;

        System.out.println("Notas generadas:");

        for (int i = 0; i < 20; i++) {

            int nota = (int) (Math.random() * 5); // entre 0 y 4

            switch (nota) {
                case 0:
                    System.out.println("suspenso");
                    suspenso++;
                    break;
                case 1:
                    System.out.println("suficiente");
                    suficiente++;
                    break;
                case 2:
                    System.out.println("bien");
                    bien++;
                    break;
                case 3:
                    System.out.println("notable");
                    notable++;
                    break;
                case 4:
                    System.out.println("sobresaliente");
                    sobresaliente++;
                    break;
            }
        }

        System.out.println();
        System.out.println("Recuento:");
        System.out.println("Numero de suspensos: " + suspenso);
        System.out.println("Numero de suficientes: " + suficiente);
        System.out.println("Numero de bienes: " + bien);
        System.out.println("Numero de notables: " + notable);
        System.out.println("Numero de sobresalientes: " + sobresaliente);
*/
        //--------------------Ejercicio 12 (6.3)--------------------\\
        System.out.println("Ejercicio 12");

        final int filas = 20;
        final int columnas = 40;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int codigo = (int) (Math.random() * 95) + 32;
                System.out.print((char) codigo);
            }
            System.out.println();
        }
/*
        //--------------------Ejercicio 13 (6.3)--------------------\\
        System.out.println("Ejercicio 13");

        int dado1;
        int dado2;
        int tiradas = 0;

        do {
            dado1 = (int) (Math.random() * 6) + 1; // entre 1 y 6
            dado2 = (int) (Math.random() * 6) + 1; // entre 1 y 6
            tiradas++;
            System.out.println(tiradas + ": " + dado1 + " y " + dado2);
        } while (dado1 != dado2);

        System.out.println("Han salido dos dados iguales en la tirada " + tiradas);

        //--------------------Ejercicio 14 (6.3)--------------------\\
        System.out.println("Ejercicio 14");
*/

    }
     }
