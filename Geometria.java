/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.geometria;
import java.util.Scanner;
import java.lang.Math;

public class Geometria {

    public static void main(String[] args) {
        
        char controle;
        Volume vol = new Volume();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o lado A:");
        double a = scan.nextDouble();
        vol.setA(a);
                
        System.out.println("Insira o lado B");
        double b = scan.nextDouble();
        vol.setB(b);
        
        System.out.println("Insira o lado C");
        double c = scan.nextDouble();
        vol.setC(c);
        
        System.out.println("Insira o raio R:");
        double r = scan.nextDouble();
        vol.setR(r);
        
        System.out.println("Insira a altura H:");
        double h = scan.nextDouble();
        vol.setH(h);
        
        System.out.println("O volume do cubo será: " + vol.getCubo() + "uv");
        System.out.println("O volume do prisma será: " + vol.getPrisma() + "uv");
        System.out.println("O volume do cilindro será: " + vol.getCilindro() + "uv");
        System.out.println("O volume do esfera será: " + vol.getEsfera() + "uv");
        System.out.println("O volume do cone será: " + vol.getCone() + "uv");
        System.out.println("O volume do pirâmide será: " + vol.getPiramide() + "uv");
        
/*
        switch (controle) {

case 1:

    System.out.println("O volume do Cubo é:" + vol.getCubo()); 

break;

case 2:

    System.out.println("O volume do Prisma é:" + vol.getPrisma());

break;

case 3:

    System.out.println("O volume do Cilindro é:" + vol.getCilindro());

break;

case 4:
    
    System.out.println("O volume do Esfera é:" + vol.getEsfera());

break;

case 5:

    System.out.println("O volume do Cone é:" + vol.getCone());

break;

case 6:

    System.out.println("O volume do Pirâmide é:" + vol.getPiramide());

break;

default:

      }
        
*/
    }
}
