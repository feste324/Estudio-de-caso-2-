/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso.pkg2;

import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashMap<Integer, Corredor> corredores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int contadorCorredores = 1;
        String o = "libre";

        do {
            System.out.println("\n Administrador de habitaciones  ");
            System.out.println("1. Lista datos de habitaciones ");
            System.out.println("2. Cambiar informacion de habitaciones ");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    int numero = 2;

                    System.out.println("Total de habitaciones piso numero 1  :  " + numero);
                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Habitacion  " + i + "   Esta limpia o sucia dijite su respuesta ");
                        String nombre = scanner.nextLine();
                        System.out.println("Habitacion: " + i + "    " + nombre + "    Simple    " + " $50    " + "   ocupacion    " + o);
                        int edad = i;
                        corredores.put(contadorCorredores, new Corredor(nombre, edad));
                    }

                    System.out.println("Total de habitaciones piso 2  " + numero);
                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Habitacion  " + i + "   Esta limpia o sucia  dijite su respuesta ");
                        String nombre = scanner.nextLine();
                        System.out.println("   Habitacion:   " + i + "    " + nombre + "   Doble   " + " $60" + "   ocupacion    " + o);
                        int edad = i;

                        corredores.put(contadorCorredores, new Corredor(nombre, edad));
                        System.out.println("  Total de habitaciones piso 3   " + numero);
                    }

                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Habitacion  " + i + "   Esta limpia o sucia dijite su respuesta ");
                        String nombre = scanner.nextLine();
                        System.out.println("    Habitacion: " + i + "    " + nombre + "     Familiar   " + "     $75" + "   ocupacion    " + o);
                        int edad = i;

                        corredores.put(contadorCorredores, new Corredor(nombre, edad));

                    }

                    break;

                case 2:
                    System.out.print("Digite el piso  ");
                    String a = scanner.nextLine();
                    int aa;
                    aa = Integer.parseInt(a);

                    System.out.print("Digite el habitacion 1 o 2 s digite solo el numero   ");
                    String b = scanner.nextLine();
                    int bb;
                    aa = Integer.parseInt(b);

                    int selec = 0;
                    System.out.print(" Digite 2 para cambiar la ocupacion , 1 para cambiar el estado de la limpieza    ");
                    String c = scanner.nextLine();

                    selec = Integer.parseInt(c);
                    switch (selec) {
                        case 1:
                            int i = 0;
                            System.out.print("Habitacion  " + i + "   Esta limpia o sucia dijite su respuesta ");
                            String nombre = scanner.nextLine();
                            break;
                        case 2:

                            System.out.print("Habitacion  " + "   Esta ocupada o libre  dijite su respuesta ");
                            o = scanner.nextLine();
                            break;
                        default:
                            System.out.println("seleccion    invalida");

                    }

                    break;

                case 3:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
