/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponche", "Gabriel Levis", "David Bell"};
        double[] promedios = new double[3];
        int fila;
        int col;
        double suma;
        double valor;

        for (fila = 0; fila < 3; fila++) {
            suma = 0;
            for (col = 0; col < 4; col++) {
                suma = suma + notas[fila][col];

            }
            valor = suma/4;
            promedios[fila] = valor;
        }
        for(fila = 0; fila < 3;fila++){
            System.out.printf("Estudiante %s tiene un promedio de %.2f\n", estudiantes[fila], promedios[fila]);
        }
    }

}
