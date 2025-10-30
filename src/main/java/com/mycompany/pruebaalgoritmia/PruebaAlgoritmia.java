/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebaalgoritmia;
import java.util.Scanner;
/**
 *
 * @author ALUMNO#
 */

public class PruebaAlgoritmia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("ingrese su primer numero:" );
        num1 = sc.nextInt();
        int num2;
        System.out.println("ingrese su segundo numero:" );
        num2 = sc.nextInt();
       int result = num1 + num2;
        System.out.println("el resultado de la suma es: " + result);
    }
}
