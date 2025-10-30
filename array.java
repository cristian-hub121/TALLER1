/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pood2.quizactividad;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ALUMNO#
 */
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<String>fruta = new ArrayList<>();
        ArrayList<Double> precio = new ArrayList<>();

        char continuar;

        int cont = 0;

        do{ 

        System.out.println("ingrese la fruta  # " + (cont+1)+" :");
      fruta.add(sc.nextLine());

      System.out.println("ingrese el precio de la # "+ fruta.get(cont)+":" );
      precio.add(sc.nextDouble());

      System.out.println(" desea continuar ingresando s para si, n para no: ");
      continuar = sc.next().charAt(0);
      sc.nextLine();

      cont ++;
        }while(continuar=='s');
      for(int j=0;j<fruta.size();j++){


     System.out.println("la fruta es:" +fruta.get(j)+"precio ="+precio.get(j));
      }

    }

}
