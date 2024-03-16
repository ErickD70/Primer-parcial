/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerparcialprograapli2;
import java.util.Scanner;
/**
 *
 * @author Erick Jeovanny Ayala Ardon
 */
public class PRIMERPARCIALPROGRAAPLI2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
       
        int mediano = num1 + num2 + num3 - max - min;
        
        String paridadMax = (max % 2 == 0) ? "par" : "impar";
        String paridadMin = (min % 2 == 0) ? "par" : "impar";
        String paridadMediano = (mediano % 2 == 0) ? "par" : "impar";
        
        System.out.println("El número " + max + " es el número más grande de los tres y es " + paridadMax);
        System.out.println("El número " + mediano + " es el número de en medio de los tres y es " + paridadMediano);
        System.out.println("El número " + min + " es el número más pequeño de los tres y es " + paridadMin);
       
    }
}
