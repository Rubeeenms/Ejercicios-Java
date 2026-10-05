/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author mañana
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
      /* --------------------Ejercicio 1 (2.5)--------------------\\
        System.out.println("Ejercicio 1");

        int x;
        int y;

        x = 144;
        y = 999;

        int sum = x + y;
        System.out.println("La suma es: " + sum);

        int rest = x - y;
        System.out.println("La resta es: " + rest);

        int mult = x * y;
        System.out.println("La multiplicacion es: " + mult);

        double div = y / x;
        System.out.println("La division es: " + div);

        System.out.println("--------------------");

        //--------------------Ejercicio 2 (2.5)--------------------\\
        System.out.println("Ejercicio 2");

        String nombre = "Ruben";
        System.out.println("Mi nombre es: " + nombre);

        System.out.println("--------------------");

        //--------------------Ejercicio 3 (2.5)--------------------\\
        System.out.println("Ejercicio 3");

        String nombre1 = "Ruben";
        String direccion = "El Palmar De Troya";
        String telefono = "+34 348 945 023";

        System.out.println("Mi nombre es: " + nombre1);
        System.out.println("Mi direccion es: " + direccion);
        System.out.println("Mi telefono es: " + telefono);

        System.out.println("--------------------");

        //--------------------Ejercicio 4 (2.5)--------------------\\
        System.out.println("Ejercicio 4");

        double euro = 100;
        double peseta = euro * 166.366;

        System.out.println(+euro + " euros son " + peseta + " pesetas");

        System.out.println("--------------------");

        //--------------------Ejercicio 5 (2.5)--------------------\\
        System.out.println("Ejercicio 5");

        double pesetas = 1000000;
        double euros = pesetas / 166.366;

        System.out.println(+pesetas + " pesetas son " + euros + " euros");

        System.out.println("--------------------");

        //--------------------Ejercicio 6 (2.5)--------------------\\
        System.out.println("Ejercicio 6");

        double precio = 100.0;

        double iva = precio * 0.21;

        double total = precio + iva;

        System.out.println("Base imponible: " + precio + " euros");
        System.out.println("IVA (21%): " + iva + " euros");
        System.out.println("Total factura: " + total + " euros");

        System.out.println("--------------------");
        
        //--------------------Ejercicio 1 (3.4)--------------------\\
        System.out.println("Ejercicio 1");

        Scanner multi = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double numero1 = multi.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double numero2 = multi.nextDouble();

        double resultado = numero1 * numero2;

        System.out.println("El resultado de la multiplicacion es: " + resultado);

        System.out.println("--------------------");

        //--------------------Ejercicio 2 (3.4)--------------------\\
        System.out.println("Ejercicio 2");

        Scanner cambio = new Scanner(System.in);
        double pesetas = 166.366;

        System.out.println("Introduce la cantidad en euros a convertir: ");
        double euro = cambio.nextDouble();

        double convertir = euro * pesetas;

        System.out.println(euro + " euros equivalen a " + convertir + " pesetas");

        System.out.println("--------------------");

        //--------------------Ejercicio 3 (3.4)--------------------\\
        System.out.println("Ejercicio 3");

        Scanner cambio2 = new Scanner(System.in);
        double euros = 166.366;

        System.out.println("Introduce la cantidad en pesetas a convertir: ");
        double pesetas2 = cambio.nextDouble();

        double convertir2 = pesetas2 / euros;

        System.out.println(pesetas2 + " pesetas equivalen a " + convertir2 + " euros");

        //--------------------Ejercicio 4 (3.4)--------------------\\
        System.out.println("Ejercicio 4");

        Scanner opera = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = opera.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = opera.nextDouble();

        double suma = numero1 + numero2;

        System.out.println("El resultado de la suma es: " + suma);

        double resta = numero1 - numero2;

        System.out.println("El resultado de la resta es: " + resta);

        double multiplica = numero1 * numero2;

        System.out.println("El resultado de la multiplicacion es: " + multiplica);

        double div = numero1 / numero2;

        System.out.println("El resultado de la division es: " + div);

        //System.out.println("--------------------");
        
        //--------------------Ejercicio 5 (3.4)--------------------\\
        System.out.println("Ejercicio 5");

        Scanner area = new Scanner(System.in);

        System.out.print("Introduce la base del rectangulo en cm: ");
        double base = area.nextDouble();

        System.out.print("Introduce la altura del rectangulo en cm: ");
        double altura = area.nextDouble();

        double resultado = base * altura;

        System.out.println("El area del rectangulo es: " + resultado + "cm²");

        System.out.println("--------------------");

        //--------------------Ejercicio 6 (3.4)--------------------\\
        System.out.println("Ejercicio 6");

        Scanner area2 = new Scanner(System.in);

        System.out.print("Introduce la base del triangulo en cm: ");
        double baseT = area2.nextDouble();

        System.out.print("Introduce la altura del triangulo en cm: ");
        double alturaT = area2.nextDouble();

        double resultadoT = (baseT * alturaT) / 2;

        System.out.println("El area del triangulo es: " + resultado + "cm²");

        System.out.println("--------------------");

        //--------------------Ejercicio 7 (3.4)--------------------\\
        System.out.println("Ejercicio 7");

        Scanner factura = new Scanner(System.in);

        System.out.print("Introduce la base imponible (€): ");

        double base€ = factura.nextDouble();

        double IVA = 0.21;

        double importeIva = base€ * IVA;
        double totalfactura = base€ + importeIva;

        System.out.printf("Total factura: " + totalfactura + "euros");

        System.out.println("--------------------");

        //--------------------Ejercicio 8 (3.4)--------------------\\
        System.out.println("Ejercicio 8");

        Scanner salario = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas por dia:");

        double horas = salario.nextDouble();

        double salariohora = 12;
        double dia = horas * salariohora;
        double semanal = dia * 5;

        System.out.println("Tu salario semanal es: " + semanal);

        System.out.println("--------------------");

        //--------------------Ejercicio 9 (3.4)--------------------\\
        System.out.println("Ejercicio 9");

        double pi = 3.14;

        Scanner volumen = new Scanner(System.in);

        System.out.println("Introduce el radio:");
        double radio = volumen.nextDouble();

        System.out.println("Introduce el altura:");
        double altura2 = volumen.nextDouble();

        double totalradio = radio * radio;

        double resultadototal = pi * totalradio * altura2 / 3;

        System.out.println("El volumen total es: " + resultadototal);

        System.out.println("--------------------");

        //--------------------Ejercicio 10 (3.4)--------------------\\
        System.out.println("Ejercicio 10");

        Scanner conversor = new Scanner(System.in);

        System.out.print("Introduce los Mb: ");
        double mb = conversor.nextDouble();

        double kb = mb * 1024;

        System.out.println(mb + " Mb son " + kb + " Kb");

        System.out.println("--------------------");
        
        //--------------------Ejercicio 1 (4.5)--------------------\\
        System.out.println("Ejercicio 1");
         
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el dia de la semana (1 = lunes ... 7 = domingo): ");
        int dia = teclado.nextInt();

        if ((dia < 1) || (dia > 7)) {
            System.out.println("Ese dia no existe");
        }
        
        if (dia == 1) {
            System.out.println("A primera hora toca BD");
        }
        
        if (dia == 2) {
            System.out.println("A primera hora toca SI");
        }
        
        if (dia == 3) {
            System.out.println("A primera hora toca Programacion");
        }
        
        if (dia == 4) {
            System.out.println("A primera hora toca IPE");
        }
        
        if (dia == 5) {
            System.out.println("A primera hora toca ED");
        }
        
        if ((dia == 6) || (dia == 7)) {
            System.out.println("No hay clase ese dia");
        
        System.out.println("--------------------");
        
        //--------------------Ejercicio 2 (4.5)--------------------\\
        System.out.println("Ejercicio 2");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime una hora en punto: ");
        int hora = teclado.nextInt();
        
        if ((hora < 0) || (hora >23)) {
            System.out.println("Introduce una hora valida");
        }
        
        if ((hora > 5) && (hora < 13)) {
            System.out.println("Buenos Dias");
        }
        
        if ((hora > 12) && (hora < 21)) {
            System.out.println("Buenas Tardes");
        }
        
        if ((hora > 20) || (hora < 6)) {
            System.out.println("Buenas Noches");
        }
        
        System.out.println("--------------------");
        
        //--------------------Ejercicio 3 (4.5)--------------------\\
         System.out.println("Ejercicio 3");
         
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el dia de la semana (1 = lunes ... 7 = domingo): ");
        int dia = teclado.nextInt();

        if ((dia < 1) || (dia > 7)) {
            System.out.println("Ese dia no existe");
        }
        
        if (dia == 1) {
            System.out.println("Lunes");
        }
        
        if (dia == 2) {
            System.out.println("Martes");
        }
        
        if (dia == 3) {
            System.out.println("Miercoles");
        }
        
        if (dia == 4) {
            System.out.println("Jueves");
        }
        
        if (dia == 5) {
            System.out.println("Viernes");
        }
        
        if (dia == 6) {
            System.out.println("Sabado");
        }
        
        if (dia == 7) {
            System.out.println("Domingo");
        }
        
        System.out.println("--------------------");
        
        //--------------------Ejercicio 4 (4.5)--------------------\\
        System.out.println("Ejercicio 4");

        Scanner salario = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas en la semana:");

        double horas = salario.nextDouble();

        if (horas < 1) {
            System.out.println("No has trabajado ninguna hora");
        } 
        
        if ((horas > 0) && (horas <= 40)) {
            int paga = 12;
            double semana = paga * horas;
            System.out.println("Tu salario semanal es de: " + semana + "euros");
        }
        
        if (horas > 40) {
            int paga = 12;
            int pagaExtra = 16;
            double semana = 40 * paga + (horas - 40) *16;
            System.out.println("Tu salario semanal es de: " + semana + "euros");
        }

        System.out.println("--------------------"); 
      
        //--------------------Ejercicio 5 (4.5)--------------------\\
        System.out.println("Ejercicio 5");
        
        Scanner ecuacion = new Scanner(System.in);
        
        System.out.println("Introduzca el valor a:");
        double a = ecuacion.nextDouble();
        
        System.out.println("Introduzca el valor b:");
        double b = ecuacion.nextDouble();
        
        if ((a != 0) || (b == 0)) {
            double solucion = -b / a;
            System.out.println("La solucion de la ecuacion es :" + solucion);
        }
        
        if ((a == 0) && (b == 0)) {
            System.out.println("La ecuacion tiene infinitas soluciones (tiende a infinito)");
        }
       
        System.out.println("--------------------");
      
        //--------------------Ejercicio 6 (4.5)--------------------\\
        System.out.println("Ejercicio 6");
        
        Scanner altura = new Scanner(System.in);
        
        double g = 9.81;
        
        System.out.println("Introduzca el valor h en metros:");
        double h = altura.nextDouble();
        
        if (h < 0) {
            System.out.println("La altura no puede ser negativa");
        }
        if (h == 0) {
            System.out.println("El objeto tardará 0 segundos en caer");
        }
        
        if (h > 0) {
            double valor = 2 * h / g;   

            // no se me ocurre como seguir

            System.out.printf("El objeto tardara" + t + "segundos");
        }

        System.out.println("--------------------");
        
        //--------------------Ejercicio 7 (4.5)--------------------\\
        System.out.println("Ejercicio 7");

        Scanner media = new Scanner(System.in);
        
        System.out.println("Introduce las notas para hacer la media separadas por espacios:");
        
        
        double x1 = media.nextDouble();
        double x2 = media.nextDouble();
        double x3 = media.nextDouble();
        
        if ((x1 > 10) || (x2 > 10) || (x3 > 10)) {
        System.out.println("Las notas no pueden ser superiores a 10");
        }
       
        else if ((x1 < 0) || (x2 < 0) || (x3 < 0)) {
        System.out.println("Las notas no pueden ser menores a 0");
        }
       
        else if ((x1 >= 0) || (x2 >= 0) || (x3 >= 0)) {
            
            double medias = (x1 + x2 + x3) / 3;
            System.out.println("La media de las notas es: " + medias);
        }
      
        System.out.println("--------------------");
       
        //--------------------Ejercicio 8 (4.5)--------------------\\
        System.out.println("Ejercicio 8");
        
        Scanner media = new Scanner(System.in);
        
        System.out.println("Introduce las notas para hacer la media separadas por espacios:");
        
        
        double x1 = media.nextDouble();
        double x2 = media.nextDouble();
        double x3 = media.nextDouble();
        
        if ((x1 > 10) || (x2 > 10) || (x3 > 10)) {
        System.out.println("Las notas no pueden ser superiores a 10");
        }
        
        else if ((x1 < 0) || (x2 < 0) || (x3 < 0)) {
        System.out.println("Las notas no pueden ser menores a 0");
        }
        
        else if ((x1 >= 0) || (x2 >= 0) || (x3 >= 0)) {
            
            double medias = (x1 + x2 + x3) / 3;
            
            if (medias <= 4.9) {
                System.out.println("La media de las notas es un insuficiente"); 
                System.out.println("La media es un:" + medias);
            }
            
            if ((medias >= 5) && (medias <= 6.9)) {
                System.out.println("La media de las notas es un suficiente");
                System.out.println("La media es un:" + medias);
            }
            
            if ((medias >= 7) && (medias <=8.9)) {
                System.out.println("La media de las notas es un notable");
                System.out.println("La media es un:" + medias);
            }
            
            if ((medias >= 9) && (medias <=10)) {
                System.out.println("La media de las notas es un sobresaliente");
                System.out.println("La media es un:" + medias);
            }
            
            }
        
            System.out.println("--------------------");
       
        //--------------------Ejercicio 9 (4.5)--------------------\\
        System.out.println("Ejercicio 9");
        
        Scanner ecuacion = new Scanner(System.in);

        System.out.println("Introduce los coeficientes a, b y c separados por espacios:");

        double a = ecuacion.nextDouble();
        double b = ecuacion.nextDouble();
        double c = ecuacion.nextDouble();

        if (a == 0) {
        System.out.println("No es una ecuación de segundo grado (a no puede ser 0)");
        }
        
        // no se me ocurre como seguir
        
        System.out.println("--------------------");
      
        //--------------------Ejercicio 10 (4.5)--------------------\\
        System.out.println("Ejercicio 10");
        
        Scanner horoscopo = new Scanner(System.in);
        
        System.out.println("Introduce el dia y el mes de nacimiento separados por espacios:");
        
        int dia = horoscopo.nextInt();
        int mes = horoscopo.nextInt();
        
        int diadelmes;
        if (mes == 2) {
            diadelmes = 28;
        }
        else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            diadelmes = 30;
        }
        else {
            diadelmes = 31;
        }
        
        if ((mes < 1) || (mes > 12)) {
            System.out.println("Ese mes no existe");
        }
                else {
            String signo;

            if (mes == 1) {
                if (dia <= 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
            } else if (mes == 2) {
                if (dia <= 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
            } else if (mes == 3) {
                if (dia <= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Aries";
                }
            } else if (mes == 4) {
                if (dia <= 19) {
                    signo = "Aries";
                } else {
                    signo = "Tauro";
                }
            } else if (mes == 5) {
                if (dia <= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Geminis";
                }
            } else if (mes == 6) {
                if (dia <= 20) {
                    signo = "Geminis";
                } else {
                    signo = "Cancer";
                }
            } else if (mes == 7) {
                if (dia <= 22) {
                    signo = "Cancer";
                } else {
                    signo = "Leo";
                }
            } else if (mes == 8) {
                if (dia <= 22) {
                    signo = "Leo";
                } else {
                    signo = "Virgo";
                }
            } else if (mes == 9) {
                if (dia <= 22) {
                    signo = "Virgo";
                } else {
                    signo = "Libra";
                }
            } else if (mes == 10) {
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpio";
                }
            } else if (mes == 11) {
                if (dia <= 21) {
                    signo = "Escorpio";
                } else {
                    signo = "Sagitario";
                }
            } else {
                if (dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
            }

            System.out.println("Tu signo es: " + signo);
        }   
      
      System.out.println("--------------------"); 
      
      //--------------------Ejercicio 11 (4.5)--------------------\\
        System.out.println("Ejercicio 11");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una hora y sus minutos, separadolos por espacios:");
        
        int horas = teclado.nextInt();
        int minutos = teclado.nextInt();
        
        if (horas < 0 || horas > 23) {
        System.out.println("Las horas deben estar entre 0 y 23");
            }
        else if (minutos < 0 || minutos > 59) {
        System.out.println("Los minutos deben estar entre 0 y 59");
            }
        
        else {
        int segundosTranscurridos = horas * 3600 + minutos * 60;
        int segundosRestantes = 24 * 3600 - segundosTranscurridos;

        System.out.println("Faltan " + segundosRestantes + " segundos para la medianoche");
        }

        System.out.println("--------------------");
        
      
      //--------------------Ejercicio 12 (4.5)--------------------\\
        System.out.println("Ejercicio 12");
        
        Scanner teclado = new Scanner(System.in);
        
        int puntos = 0;
        int respuesta;

        System.out.println("CUESTIONARIO");
        System.out.println("Responde con el número de la opción (1, 2 o 3)");
        
        
        System.out.println("Primera pregunta: ¿Que lenguaje se aprende en Programacion?");
        System.out.println("   1) HTML");
        System.out.println("   2) Java");
        System.out.println("   3) C++");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
            
        System.out.println("2. ¿Que se usa para decir ,y, en Programacion?");
        System.out.println("   1) &&");
        System.out.println("   2) ||");
        System.out.println("   3) ==");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 1;
        }

        System.out.println("3. ¿Cuanto es un byte en bit?");
        System.out.println("   1) 10");
        System.out.println("   2) 8");
        System.out.println("   3) 1");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
        }

        System.out.println("4. ¿Que numero en decimal es 0001?");
        System.out.println("   1) 10");
        System.out.println("   2) 1");
        System.out.println("   3) 5");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
        }

        System.out.println("5. ¿Donde se aprende a hacer ERD?)");
        System.out.println("   1) BD");
        System.out.println("   2) SI");
        System.out.println("   3) ED");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 1;
        }

        System.out.println("6. ¿Que tipo de dato guarda numeros con decimales en Java? (Programación)");
        System.out.println("   1) int");
        System.out.println("   2) String");
        System.out.println("   3) double");
        respuesta = teclado.nextInt();
        if (respuesta == 3) {
            puntos = puntos + 1;
        }

        System.out.println("7. ¿Que se usa para mostrar datos en pantalla en Java?");
        System.out.println("   1) printf");
        System.out.println("   2) System.out.println");
        System.out.println("   3) Main");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
        }

        System.out.println("8. ¿Cuantos modulos hay en DAW?");
        System.out.println("   1) 10");
        System.out.println("   2) 4");
        System.out.println("   3) 8");
        respuesta = teclado.nextInt();
        if (respuesta == 3) {
            puntos = puntos + 1;
        }

        System.out.println("9. ¿Que navegador se usa principalmente en Linux?");
        System.out.println("   1) Edge");
        System.out.println("   2) Firefox");
        System.out.println("   3) Zen");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
        }

        System.out.println("10. ¿Que significa Lmarc?");
        System.out.println("   1) Las marcas");
        System.out.println("   2) Lenguaje de Marcas");
        System.out.println("   3) Ninguna es correcta");
        respuesta = teclado.nextInt();
        if (respuesta == 2) {
            puntos = puntos + 1;
        }

        System.out.println();
        System.out.println("Has acertado " + puntos + " de 10 preguntas");
        System.out.println("Tu calificación es: " + puntos + " puntos");
        
        }
       
        System.out.println("--------------------");
       
        
      
         //--------------------Ejercicio 13 (4.5)--------------------\\
        System.out.println("Ejercicio 13");
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b = teclado.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int c = teclado.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Numeros ordenados de menor a mayor: " + a + ", " + b + ", " + c);
        
        System.out.println("--------------------");
      
        
      //--------------------Ejercicio 14 (4.5)--------------------\\
        System.out.println("Ejercicio 14");
      
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Introduce un numero entero:");
        
        int numero = teclado.nextInt();
        
        boolean par = numero % 2 == 0;
        boolean div5 = numero % 5 == 0;
        
        if (par && div5) {
            System.out.println("El numero es par y divisible entre 5");
        } else if (par) {
            System.out.println("El numero es par y no es divisible entre 5");
        } else if (div5) {
            System.out.println("El numero es divisible entre 5 pero no es par");
        } else {
            System.out.println("El numero no es par ni es divisible entre 5");
        }
       
        System.out.println("--------------------");
        
       //--------------------Ejercicio 15 (4.5)--------------------\\
        System.out.println("Ejercicio 15");
      
      
      Scanner teclado = new Scanner(System.in);
      
      
      System.out.print("Introduce un caracter (letra, numero o simbolo): ");
      
      String c = teclado.next();
      
      System.out.println("¿Hacia donde apunta el vertice?");
      System.out.println("1. Arriba");
      System.out.println("2. Abajo");
      System.out.println("3. Izquierda");
      System.out.println("4. Derecha");
      System.out.print("Elige una opcion: ");
      
      int opcion = teclado.nextInt();
      
              switch (opcion) {
            case 1:
                
                System.out.println("    " + c);
                System.out.println("   " + c + c + c);
                System.out.println("  " + c + c + c + c + c);
                System.out.println(" " + c + c + c + c + c + c + c);
                System.out.println(c + c + c + c + c + c + c + c + c);
                break;
            case 2:
                
                System.out.println(c + c + c + c + c + c + c + c + c);
                System.out.println(" " + c + c + c + c + c + c + c);
                System.out.println("  " + c + c + c + c + c);
                System.out.println("   " + c + c + c);
                System.out.println("    " + c);
                break;
            case 3:
                
                System.out.println("    " + c);
                System.out.println("   " + c + c);
                System.out.println("  " + c + c + c);
                System.out.println(" " + c + c + c + c);
                System.out.println(c + c + c + c + c);
                System.out.println(" " + c + c + c + c);
                System.out.println("  " + c + c + c);
                System.out.println("   " + c + c);
                System.out.println("    " + c);
                break;
            case 4:
                
                System.out.println(c);
                System.out.println(c + c);
                System.out.println(c + c + c);
                System.out.println(c + c + c + c);
                System.out.println(c + c + c + c + c);
                System.out.println(c + c + c + c);
                System.out.println(c + c + c);
                System.out.println(c + c);
                System.out.println(c);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        System.out.println("--------------------");


      
      //--------------------Ejercicio 16 (4.5)--------------------\\
        System.out.println("Ejercicio 16");
      
        Scanner teclado = new Scanner(System.in);
        
        double puntos = 0;
        int respuesta;

        System.out.println("CUESTIONARIO");
        System.out.println("Responde con el número de la opción (1, 2 o 3)");
        
        
        System.out.println("¿Cuando estas cerca de ella pone el movil boca abajo?");
        System.out.println("   1) Verdadero");
        System.out.println("   2) Falso");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 3;
            
        System.out.println("2. ¿Suele salir mucho con amigos sin avisarte?");
        System.out.println("   1) Verdadero");
        System.out.println("   2) Falso");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 3;
        }

        System.out.println("3. ¿Te suele ocultar cosas?");
        System.out.println("   1) Verdadero");
        System.out.println("   2) Falso");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 3;
        }

        System.out.println("4. ¿Se molesta por que le preguntas con quien ha estado?");
        System.out.println("   1) Verdadero");
        System.out.println("   2) Falso");
        respuesta = teclado.nextInt();
        if (respuesta == 1) {
            puntos = puntos + 3;
        }

        puntos = puntos / 12;
        puntos = puntos * 100;
        
        System.out.println();
        System.out.println("La probabilidad de que sea infiel es de  " + puntos + " %");
        
        }
              */
    }
}