/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] vendedores = {"Jessica Cole","Robert Wallace"};
        int[][] ventas = new int[2][5];
        int[] sumaVentas = {0,0};
        int fila;
        int col;        
        int valor;
        String[] dias = {"lunes","martes","miercoles","jueves","viernes"};
        
        for(fila = 0; fila < 2; fila++){
            System.out.printf("ingrese los datos de venta de %s:\n", vendedores[fila]);
            for(col = 0; col < 5;col++){
                System.out.printf("ingrese ventas del dia %s\n",dias[col]);
                valor = entrada.nextInt();
                ventas[fila][col] = valor; 
                sumaVentas[fila] = sumaVentas[fila] + ventas[fila][col];
            }
        }
        for(fila = 0; fila < 2; fila++){
            System.out.printf("vendedor/a %s\n", vendedores[fila]);
            System.out.printf("ha realizdo un total de ventas de : %d\n", sumaVentas[fila]);
        }
                
    }
    
}
