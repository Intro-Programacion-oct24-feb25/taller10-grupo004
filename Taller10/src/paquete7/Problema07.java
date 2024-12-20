/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

public class Problema07 {

    public static void main(String[] args) {

        double[][] dato1 = {{0, 2, 0}, {1, 0, 0}}; //
        // double[][] dato1 = {{0, 0, 0},{0, 0, 0}}; //
        /*
            Imprimir si el arreglo es NULO, se considera un arreglo NULO cuando
            la suma de los valores es igual a 0

         */
        double suma = 0;

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                suma = suma + dato1[fila][col];
            }

        }

        if (suma == 0) {
            System.out.printf("El arreglo es ´´NULO´´\n");

        } else {
            System.out.printf("El arreglo no es nulo\n");
        }
    }
}
