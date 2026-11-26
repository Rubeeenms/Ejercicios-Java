/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author marti
 */
public class Arrays {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double[] nota = new double[4];
        System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tus exámenes");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen nº " + (i + 1) + ": ");
            nota[i] = teclado.nextDouble();
        }
        System.out.println("Tus notas son: ");
        double suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print(nota[i] + " ");
            suma += nota[i];
        }
        System.out.println("\nLa media es " + suma / 4);
    }
}
