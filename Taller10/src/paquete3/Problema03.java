/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        double suma;
        int fila;
        int col;
        double promedio;

        for (fila = 0; fila < 3; fila++) {
            for (col = 0; col < 3; col++) {

                if (notasCuantitativas[fila][col] > 0 && notasCuantitativas[fila][col] < 6) {
                    notasCualitativas[fila][col] = "Bueno";
                } else {
                    if (notasCuantitativas[fila][col] >= 6 && notasCuantitativas[fila][col] < 9) {
                        notasCualitativas[fila][col] = "Muy bueno";
                    } else {
                        if (notasCuantitativas[fila][col] >= 9 && notasCuantitativas[fila][col] <= 10) {
                            notasCualitativas[fila][col] = "Sobresaliente";
                        }
                    }
                }
            }

        }

        for (fila = 0; fila < 3; fila++) {
            for (col = 0; col < 3; col++) {
                System.out.printf("La nota en la psicion [%d][%d] es %s\n", fila, col, notasCualitativas[fila][col]);
            }

        }
    }
}
