/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;
import java.util.Random;
import javax.sound.midi.Soundbank;

/**
 *
 * @author marti
 */
public class Arrays {

    public static void main(String[] args) {

        //--------------------Ejercicio 1 (7.4.1)--------------------\\
/*        
        Define un array de 12 números enteros con nombre "num" y asigna los valores 
        según la tabla que se muestra a continuación.Muestra el contenido de todos 
        los elementos del array. ¿Qué sucede con los valores de los elementos que no
        han sido inicializados ?
         */
 /*    
        int[] num = new int[12];
        
        num [0] = 39;
        num [1] = -2;
        num [4] = 0;
        num [6] = 14;
        num [8] = 5;
        num [9] = 120;
        
        System.out.println("Elementos del Array: " + num[0] + " " + num[1] + " "  + num[2] + " "  + num[3] + " "  + num[4] + " "  + num[5] + " "  + num[6] + " "  + num[7] + " "  + num[8] + " "  + num[9] + " "  + num[10] + " "  + num[11]);
         */
        //--------------------Ejercicio 2 (7.4.1)--------------------\\
/*        
        Define un array de 10 caracteres con nombre simbolo y asigna valores a los
        elementos según la tabla que se muestra a continuación. Muestra el contenido
        de todos los elementos del array. ¿Qué sucede con los valores de los elementos
        que no han sido inicializados?
         */
 /*
        char[] simbolo = new char[10];
        
        simbolo [0] = 'a';
        simbolo [1] = 'x';
        simbolo [4] = '@';
        simbolo [6] = ' ';
        simbolo [7] = '+';
        simbolo [8] = 'Q';

        System.out.println("Elementos del Array: " + simbolo[0] + " " + simbolo[1] + " "  + simbolo[2] + " "  + simbolo[3] + " "  + simbolo[4] + " "  + simbolo[5] + " "  + simbolo[6] + " "  + simbolo[7] + " "  + simbolo[8] + " "  + simbolo[9]);
         */
        //--------------------Ejercicio 3 (7.4.1)--------------------\\
/*        
        Escribe un programa que lea 10 números por teclado y que luego los muestre
        en orden inverso, es decir, el primero que se introduce es el último en
        mostrarse y viceversa.
         */
 /*
        Scanner teclado = new Scanner(System.in);

        double[] num = new double[10];

        System.out.println("Dime uno a uno los numeros: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            num[i] = teclado.nextDouble();
        }

        System.out.println("Los numeros en orden inverso son:");

        for (int k = 9; k >= 0; k--) {
            System.out.println(num[k]);
        }
         */
        //--------------------Ejercicio 4 (7.4.1)--------------------\\
/*        
        Define tres arrays de 20 números enteros cada una, con nombres numero,
        cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
        array cuadrado se deben almacenar los cuadrados de los valores que hay en el
        array numero. En el array cubo se deben almacenar los cubos de los valores que
        hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
        en tres columnas..
         */
 /*
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);             //  nº entre 0 y 100
            cuadrado[i] = numero[i] * numero[i];                   //  cuadrado
            cubo[i] = numero[i] * numero[i] * numero[i];        // cubo
        }

        System.out.println("Numero\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
         */
        //--------------------Ejercicio 5 (7.4.1)--------------------\\
/*        
        Escribe un programa que pida 10 números por teclado y que luego muestre
        los números introducidos junto con las palabras “máximo” y “mínimo” al lado
        del máximo y del mínimo respectivamente.
         */
 /*
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        // bucle para los 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // bucle para maximo y minimo
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // bucle de sout
        System.out.println("\nNumeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == max) {
                System.out.print("  maximo");
            }
            if (numeros[i] == min) {
                System.out.print("  minimo");
            }
            System.out.println();
        }
         */
        //--------------------Ejercicio 6 (7.4.1)--------------------\\
/*        
        Escribe un programa que lea 15 números por teclado y que los almacene en un
        array. Rota los elementos de ese array, es decir, el elemento de la posición 0
        debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
        la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
        del array.
         */
 /*
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];

        // bucle para los 15 nº
        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // bucle para adelantar los numeros una posicion
        int ultimo = numeros[15 - 1];               // guardar el último
        for (int i = 15 - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];            // cada uno toma el valor del anterior
        }
        numeros[0] = ultimo;                           // el último pasa a la posición 0

        // bucle de sout
        System.out.println("Rotado:");
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();        
         */
        //--------------------Ejercicio 7 (7.4.1)--------------------\\
/*        
        Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
        muestre por pantalla separados por espacios. El programa pedirá entonces
        por teclado dos valores y a continuación cambiará todas las ocurrencias del
        primer valor por el segundo en la lista generada anteriormente. Los números
        que se han cambiado deben aparecer entrecomillados..
         */
 /*
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[100];
        boolean[] cambiado = new boolean[100];   // por defecto todo false

        // bucle para los 100 nº random del 0 al 20
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }

        // bucle de sout
        System.out.println("Lista generada:");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // bucle para pedir los valores
        System.out.print("\nValor a buscar: ");
        int buscar = teclado.nextInt();
        System.out.print("Valor por el que sustituir: ");
        int nuevo = teclado.nextInt();

        // bucle para sustituirlos
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == buscar) {
                numeros[i] = nuevo;
                cambiado[i] = true;
            }
        }

        // bucle de sout
        System.out.println("\nLista modificada:");
        for (int i = 0; i < 100; i++) {
            if (cambiado[i]) {
                System.out.print("\"" + numeros[i] + "\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
         */
        //--------------------Ejercicio 8 (7.4.1)--------------------\\
/*        
        Realiza un programa que pida la temperatura media que ha hecho en cada mes
        de un determinado año y que muestre a continuación un diagrama de barras
        horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
        de asteriscos o cualquier otro carácter.
         */
 /*
        Scanner teclado = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] temperatura = new int[12];

// 1. Leer las temperaturas
        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura media de " + meses[i] + ": ");
            temperatura[i] = teclado.nextInt();
        }

// 2. Dibujar el diagrama de barras horizontales
        System.out.println("Temperaturas medias:");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s\t", meses[i]);
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" " + temperatura[i]);
        }
         */
        //--------------------Ejercicio 9 (7.4.1)--------------------\\
/*        
        Realiza un programa que pida 8 números enteros y que luego muestre esos
        números junto con la palabra “par” o “impar” según proceda.
         */
 /*
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[8];

        // bucle para los 8 nº
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            num[i] = teclado.nextInt();
        }

        // bucle de sout
        System.out.println("\nNumeros introducidos:");
        for (int i = 0; i < 8; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + "  par");
            } else {
                System.out.println(num[i] + "  impar");
            }
        }       
         */
        //--------------------Ejercicio 10 (7.4.1)--------------------\\
/*        
        Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
        y que los almacene en un array. El programa debe ser capaz de pasar todos
        los números pares a las primeras posiciones del array (del 0 en adelante) y
        todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
        es necesario.
         */
/*
        int[] num = new int[20];

        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 101);             //  nº entre 0 y 100
        }
*/
        //--------------------Ejercicio 11 (7.4.1)--------------------\\
/*        
        Realiza un programa que pida 10 números por teclado y que los almacene en
        un array. A continuación se mostrará el contenido de ese array junto al índice
        (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
        primos a las primeras posiciones, desplazando el resto de números (los que
        no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
        el array resultante.
         */
/*
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        
        System.out.println("Dime diez numeros enteros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1 + ":"));
            num[i] = teclado.nextInt();
        }
        
        // bucle para el "indice"
        System.out.print("Indice");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        // bucle para el "valor" sin ordenar por los primos
        System.out.print("Valor");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + num[i]);
        }
        System.out.println();
        
        // bucle para ordenar los primos
        System.out.println("Ordenados");
        int[] ordenado = new int[10];
        int inicio = 0;
        int fin = 9;

        for (int i = 0; i < 10; i++) {
            boolean primo = num[i] > 1;

            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                ordenado[inicio] = num[i];
                inicio++;
            } else {
                ordenado[fin] = num[i];
                fin--;
            }
        }
        System.out.print("Indice");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();

        System.out.print("Valor");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + ordenado[i]);
        }
        System.out.println(" ");
*/
    }

}
