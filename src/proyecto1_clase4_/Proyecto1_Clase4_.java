/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_clase4_;


import java.util.Scanner;
        
public class Proyecto1_Clase4_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,n4,suma;
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar Numero 1:");
        n1=lectura.nextInt();
             System.out.print("Ingresar Numero 2:");
        n2=lectura.nextInt();
             System.out.print("Ingresar Numero 3:");
        n3=lectura.nextInt();
         System.out.print("Ingresar Numero 4:");
        n4=lectura.nextInt();
        //proceso de datos
        suma=n1+n2+n3+n4;
        //salida de datos
        System.out.println("La suma de los numeros es:"+suma);
               
    }
    
}
