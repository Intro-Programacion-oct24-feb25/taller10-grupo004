/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] datos = new int[2][2];
        int fila;
        int col;
        int valor;
        int contador = 0;

        for (fila = 0; fila < 2; fila++) {
            for (col = 0; col < 2; col++) {
                System.out.println("Ingrese un valor");
                valor = entrada.nextInt();
                if (valor > 1000 && valor < 1199) {
                    datos[fila][col] = valor;
                } else {
                    datos[fila][col] = 10;
                    contador = contador + 1;
                }

            }
        }
        for (fila = 0; fila < 2; fila++) {
            for (col = 0; col < 2; col++) {
                System.out.printf("El arreglo en posición [%d][%d] es: %d\n",
                        fila,
                        col,
                        datos[fila][col]);
            }
        }
        System.out.printf("veces que se agregó un valor fuera de rango: %d",
                contador);
    }
}
