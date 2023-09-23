/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colalogica;

import java.util.Scanner;

/**
 *
 * @author Carlos-PCmr
 */
public class ColaLogica {

    static Scanner sc = new Scanner(System.in);
    static int dato;
    static int n_Posiciones;
    static int n_Elementos;
    static int primero=0;
    static int cola[];

    public static void main(String[] args) {
        // TODO code application logic here

        while (true) {
            System.out.println("\tOpciones");
            System.out.println("");
            System.out.println("1.\tCrear\t|\tNueva Cola");
            System.out.println("2.\tBorrar\t|\tBorrar Cola");
            System.out.println("3.\tLlena?\t|\tVerificar si esta llena");
            System.out.println("4.\tVacia?\t|\tVerificar si esta vacia");
            System.out.println("5.\tQueue\t|\tAgregar dato");
            System.out.println("6.\tDequeue\t|\tSacar elemento");
            System.out.println("7.\tMirar\t|\tMirar primer elemento");
            System.out.println("");
            System.out.println("8.\tSalir");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Crear();
                    break;
                case 2:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para borrar");
                    } else {
                        Borrar();
                    }
                    break;
                case 3:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para verificar");
                    } else {
                        if (Llena()) {
                            System.out.println("Pila Llena");
                        }
                    }
                    break;
                case 4:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para verificar");
                    } else {
                        if (Vacia()) {
                            System.out.println("Pila Vacia");
                        }
                    }
                    break;
                case 5:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para Push");
                    } else {
                        queue();
                    }
                    break;
                case 6:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para Push");
                    } else {
                        dequeue();
                    }
                    break;
                case 7:
                    if (n_Posiciones == 0) {
                        System.out.println("No existe pila para Push");
                    } else {
                        inicio();
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }

    public static void Crear() {
        System.out.println("Ingrese el numero de posiciones");
        n_Posiciones = sc.nextInt();
        cola = new int[n_Posiciones];
        n_Elementos = 0;
        System.out.println("Tamaño de pila creada: " + cola.length + " Posiciones");
    }

    public static void Borrar() {
        System.out.println("Borrando Pila...");
        cola = null;
        System.out.println("Pila Borrada");
    }

    public static boolean Vacia() {
        if (n_Elementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Llena() {
        if (n_Elementos == n_Posiciones) {
            return true;
        } else {
            return false;
        }
    }

    public static void queue() {
        if (Llena()) {
            System.out.println("Cola llena");
        } else {
            System.out.println("Digite nuevo dato");
            int dato = sc.nextInt();
            cola[n_Elementos] = dato;
            n_Elementos++;
        }
    }

    public static void dequeue() {
        if (Vacia()) {
            System.out.println("Cola Vacia");
        } else {
            if (n_Elementos==1) {
                primero=0;
            }
            System.out.println("Dato a sacar: " + cola[primero]);
            for (int i = 0; i < n_Elementos - 1; i++) {
            cola[i] = cola[i + 1];}
            n_Elementos--;
        }
    }

    public static void inicio() {
        if (Vacia()) {
            System.out.println("No hay dato a mostrar");
        } else {
            System.out.println("El ultimo dato es: " + cola[primero]);
        }
    }
}
