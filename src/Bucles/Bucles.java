/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author mañana
 */
public class Bucles {
    public static void main(String[] args) {
/*
                //--------------------Ejercicio 1 (5.4)--------------------\\
        System.out.println("Ejercicio 1");
        
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
        }
            }
        System.out.println("--------------------");
        

        
        //--------------------Ejercicio 2 (5.4)--------------------\\
        System.out.println("Ejercicio 2");
        
        int numero = 0;

        while (numero <= 100) {
            System.out.println(numero);
            numero += 5;
        }
        System.out.println("--------------------");      
        

 
        //--------------------Ejercicio 3 (5.4)--------------------\\
        System.out.println("Ejercicio 3"); 
        
        int num = 0;
        
        do {
            num++;
            if (num % 5 == 0){
                  System.out.println(num);
            }
         } while (num <= 100);
        System.out.println("--------------------");

        //--------------------Ejercicio 4 (5.4)--------------------\\
        System.out.println("Ejercicio 4"); 
 
        for (int i = 320; i >= 160; i = i - 20) {
            System.out.println(i);
        }
        
        System.out.println("--------------------");

         //--------------------Ejercicio 5 (5.4)--------------------\\
        System.out.println("Ejercicio 5");
        
        int i = 320;
        while (i >= 160) {
            System.out.println(i);
            i -= 20;
        }
        
        System.out.println("--------------------");

 
         //--------------------Ejercicio 6 (5.4)--------------------\\
        System.out.println("Ejercicio 6");
        
        int i = 320;
        
        do {
            System.out.println(i);
            i = i - 20;
        } while (i >= 160);
        System.out.println("--------------------");

         //--------------------Ejercicio 7 (5.4)--------------------\\
        System.out.println("Ejercicio 7");
        
        Scanner teclao = new Scanner(System.in);
        
        System.out.println("Introduzca la contraseña: ");
        int code = teclao.nextInt();
        
        boolean cajaFuerte = false;
        int intento;
        
        for (int i = 0; i<4 && !cajaFuerte; intento++) {
            intento = teclao.nextInt();
            if (code == intento) {
                cajaFuerte = true;
            }
            System.out.println("quedan " + intento + "intentos");
        }
        
        if (cajaFuerte == true) { 
            
 
    }
         System.out.println("--------------------");
         
 
          //--------------------Ejercicio 8 (5.4)--------------------\\
        System.out.println("Ejercicio 8");
        
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(teclado.nextLine());
 
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        
        System.out.println("--------------------");

 

          //--------------------Ejercicio 9 (5.4)--------------------\\
        System.out.println("Ejercicio 9");
        
         Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce un numero entero: ");
        int numero = Integer.parseInt(teclado.nextLine());
 
        int digitos = 1;
        numero = numero / 10;
 
        while (numero != 0) {
            digitos++;
            numero = numero / 10;
        }
 
        System.out.println("El numero tiene " + digitos + " digito(s)");

        
        System.out.println("--------------------");

 
           //--------------------Ejercicio 10 (5.4)--------------------\\
        System.out.println("Ejercicio 10");
 
        Scanner teclado = new Scanner(System.in);
 
        double suma = 0;
        int cantidad = 0;
 
        System.out.print("Introduce un número (negativo para terminar): ");
        double numero = Double.parseDouble(teclado.nextLine());
 
        // Mientras el número no sea negativo, lo sumamos y pedimos el siguiente
        while (numero >= 0) {
            suma = suma + numero;
            cantidad++;
 
            System.out.print("Introduce un número (negativo para terminar): ");
            numero = Double.parseDouble(teclado.nextLine());
        }
 
        // Si se introdujo al menos un número, mostramos la media
        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println("La media es " + media);
        } else {
            System.out.println("No se ha introducido ningún número");
        }

        
        System.out.println("--------------------");

           //--------------------Ejercicio 11 (5.4)--------------------\\
        System.out.println("Ejercicio 11");
        
        Scanner teclado = new Scanner(System.in);
        
         // pedir numero
         System.out.println("Introduce un numero:");
        double numero = teclado.nextInt(); 
        
        // establecer las columnas
        System.out.println("Numero\tCuadrado\tCubo");
        
        //bucle para el cuadrado  y el cubo
        for (double i=0; i<6; i++) {
            double cuadrado = numero * numero;
            double cubo = numero * numero * numero;
            numero +=1;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
        System.out.println("--------------------");

 
            //--------------------Ejercicio 12 (5.4)--------------------\\
        System.out.println("Ejercicio 12");
        
        Scanner teclado = new Scanner(System.in);
        
        // pedir n
        System.out.println("Introduce cuantos terminos quieres de la serie Fibonacci: ");
        int n = teclado.nextInt();
        
        // terminos
        long primerTermino = 0;
        long segundoTermino = 1;
        
        // bucle para mostar n terminos de la serie Fibonacci
        for (int i=1; i <= n; i++) {

        System.out.print(primerTermino + " ");
        long siguienteTermino = primerTermino + segundoTermino;
        primerTermino = segundoTermino;
        segundoTermino = siguienteTermino;
        }
        System.out.println("--------------------");

 
             //--------------------Ejercicio 13 (5.4)--------------------\\
        System.out.println("Ejercicio 13");
 
        Scanner teclado = new Scanner(System.in);
        
        // declaramos las variables
        int positivo = 0;
        int negativo = 0;
        
        // bucle para 
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            double numero = Double.parseDouble(teclado.nextLine());

            if (numero > 0) {
                positivo++;
            } else if (numero < 0) {
                negativo++;
            }
            // Si es 0, no es ni positivo ni negativo
        }

        System.out.println("Numeros positivos: " + positivo);
        System.out.println("Numeros negativos: " + negativo);

        
        System.out.println("--------------------");

 
             //--------------------Ejercicio 15 (5.4)--------------------\\
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce la base (nUmero real): ");
        double base = Double.parseDouble(teclado.nextLine());
 
        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = Integer.parseInt(teclado.nextLine());
        
        double potencia = 1;
 
        for (int i = 1; i <= exponente; i++) { 
            potencia = potencia * base;
            System.out.println(base + "^" + i + " = " +potencia);
        }

        
        System.out.println("--------------------");
 
              //--------------------Ejercicio 16 (5.4)--------------------\\
                Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
 

        boolean esPrimo = numero >= 2;
 

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
 
        if (esPrimo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }

        
        System.out.println("--------------------");

 
              //--------------------Ejercicio 17 (5.4)--------------------\\
        System.out.println("Ejercicio 17");
        
        Scanner teclado = new Scanner(System.in);
 
        // pedimos numero
        int numero = 0;
        while (numero <= 0) {
            System.out.print("Introduce un numero entero positivo: ");
            numero = teclado.nextInt();
 
            if (numero <= 0) {
                System.out.println("Dato incorrecto: el número debe ser positivo");
            }
        }
 
        // bucle for para sumar  los 100 numeros siguientes al introducido
        long suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + numero + i;
        }
 
        System.out.println("La suma de los 100 numeros siguientes de " + numero + " es " + suma);

        
        System.out.println("--------------------");


             //--------------------Ejercicio 18 (5.4)--------------------\\
        System.out.println("Ejercicio 18");
        
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce el primer número: ");
        int a = teclado.nextInt();
 
        System.out.print("Introduce el segundo número (distinto del primero): ");
        int b =teclado.nextInt();
 
        // while para ver si a y b son diferentes
        while (a == b) {
            System.out.println("Dato incorrecto: los numeros deben ser diferentes");
            System.out.print("Introduce el segundo numero (diferente del primero): ");
            b = teclado.nextInt();
        }
 
        int menor = a;
        int mayor = b;
        if (b < a) {
            menor = b;
            mayor = a;
        }
 
        // bucle donde se empieza por el numero menor y se suma 7 cada vez sin pasarse del numero mayor
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
        
        System.out.println("--------------------");

 
              //--------------------Ejercicio 19 (5.4)--------------------\\  ******************************************************************
        System.out.println("Ejercicio 19");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Altura de la piramide: ");
        int altura = teclado.nextInt();
        
        System.out.print("Caracter con el que pintar: ");
        String caracter = teclado.next();
        
        for (int alto = 1; alto <= altura; alto++) {

            // pinta los espacios de la derecha para centrar la piramide, cada fila se resta uno
            for (int espacio = 1; espacio <= altura - alto; espacio++) {
                System.out.print(" ");
            }

            // caracteres que pintan (vuelta 1: 1 caracter, vuelta 2: 3 caracteres, vuelta 3: 5 caracteres...)
            for (int i = 1; i <= (2 * alto) - 1; i++) {
                System.out.print(caracter);
            }

            // salto de linea al terminar de pintar los caracteres para pasar a la siguiente fila
            System.out.println();
        }

        System.out.println("--------------------");

        //--------------------Ejercicio 20 (5.4)--------------------\\ ******************************************************************
        System.out.println("Ejercicio 20");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Altura de la piramide: ");
        int h = teclado.nextInt();

        System.out.print("Caracter con el que pintar: ");
        String caracter = teclado.next();

        for (int i = 1; i <= h; i++) {

            // pinta los espacios de la derecha para centrar la piramide, cada fila se resta uno
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            // caracteres que pintan (vuelta 1: 1 caracter, vuelta 2: 3 caracteres, vuelta 3: 5 caracteres...)
            for (int k = 1; k <= (2 * h) - 1; k++) {
                if ((k == 1) || (i == h) || (k == (2 * i - 1))) {
                    //if (((k == 1) | | (k == (2 * i -1)) | |( i == h))){ 
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }

            // salto de linea al terminar de pintar los caracteres para pasar a la siguiente fila
            System.out.println();
        }
        System.out.println("--------------------");

        //--------------------Ejercicio 21 (5.4)--------------------\\
        System.out.println("Ejercicio 21");
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = 0;
        boolean hayPares = false;

        System.out.print("Introduce un número (negativo para terminar): ");
        numero = sc.nextInt();

        while (numero >= 0) {
            contador++;

            if (numero % 2 == 0) {
                if (!hayPares || numero > mayorPar) {
                    mayorPar = numero;
                    hayPares = true;
                }
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }

            System.out.print("Introduce un número (negativo para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("--- RESULTADOS ---");
        System.out.println("Números introducidos: " + contador);

        if (contadorImpares > 0) {
            double media = (double) sumaImpares / contadorImpares;
            System.out.println("Media de los impares: " + media);
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        if (hayPares) {
            System.out.println("Mayor de los pares: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }

        System.out.println("--------------------");
        
        //--------------------Ejercicio 22 (5.4)--------------------\\
        System.out.println("Ejercicio 22");

        for (int numero = 2; numero <= 100; numero++) {

            // Partimos de que es primo y buscamos algún divisor
            boolean esPrimo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.println(numero);
            }
        }

        System.out.println("--------------------");
        
        //--------------------Ejercicio 23 (5.4)--------------------\\
        System.out.println("Ejercicio 23");   
        
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        // bucle while para ir sumando numeros hasta llegar a 10k
        while (suma <= 10000) {
            System.out.print("Introduce un numero: ");
            double numero = teclado.nextDouble();

            suma = suma + numero;
            contador++;
        }

        // media al salir del bucle (ya fuera de los 10k)
        double media = suma / contador;

        System.out.println("Total acumulado: " + suma);
        System.out.println("Números introducidos: " + contador);
        System.out.println("Media: " + media);
  
        System.out.println("--------------------");
        
        //--------------------Ejercicio 24 (5.4)--------------------\\
                System.out.println("Ejercicio 24");   
        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura de la piramide: ");
        int altura = teclado.nextInt();

        for (int alto = 1; alto <= altura; alto++) {

            // espacios de la izquierda para centrar la pirámide
            for (int espacio = 1; espacio <= altura - alto; espacio++) {
                System.out.print(" ");
            }

            // números ascendentes: 1 hasta alto
            for (int i = 1; i <= alto; i++) {
                System.out.print(i);
            }

            // números descendentes: alto-1 hasta 1
            for (int i = alto - 1; i >= 1; i--) {
                System.out.print(i);
            }

            // salto de línea para pasar a la siguiente fila
            System.out.println();
        }

        System.out.println("--------------------");
        
        //--------------------Ejercicio 25 (5.4)--------------------\\                     // Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        boolean negativo = numero < 0;
        if (negativo) {
            numero = -numero; // lo hacemos positivo
        }

        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (negativo) {
            System.out.println("El numero al revés es: -" + invertido);
        } else {
            System.out.println("El numero al revés es: " + invertido);
        }
        -------------------------------- seguir con los ejercicios de bucles --------------------------------
*/
        
    }
}
