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

        double[][] datos = new double[2][2];
        int fila;
        int col;
        double valor;
        int contador = 0;

        for (fila = 0; fila < 2; fila++) {
            for (col = 0; col < 2; col++) {
                System.out.println("Ingrese un valor");
                valor = entrada.nextDouble();
                if(valor > 1000 && valor < 1199){
                    datos[fila][col] = valor;
                } else {
                    datos[fila][col] = 10;
                    contador = contador +1;
                }
                
            }
        }
    }
}
