/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

public class Problema08 {

    public static void main(String[] args) {

        int[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        int[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
         */
        int[][] resultados = new int[2][3];

        for (int fila = 0; fila < resultados.length; fila++) {
            for (int col = 0; col < resultados[fila].length; col++) {

                if (col == 0 || (fila == 1 && col == 1)) {
                    resultados[fila][col] = dato1[fila][col];
                } else {
                    resultados[fila][col] = dato2[fila][col];
                }
            }
        }

        System.out.println("Resultados:");

        for (int fila = 0; fila < resultados.length; fila++) {
            for (int col = 0; col < resultados[fila].length; col++) {
                System.out.printf("Posicion[%d][%d] con valor de: %d\n",
                        fila,
                        col,
                        resultados[fila][col]);
            }

        }
    }
}
