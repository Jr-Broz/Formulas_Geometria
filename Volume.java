/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometria;


public class Volume {
    private double a, b, c, r, h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    double getCubo(){
        return Math.pow(a, 3);
    }
    
    double getPrisma(){
        return (a*b*c);
    }
    
    double getCilindro(){
        return (Math.PI*Math.pow(r, 2)*h);
        
    }
    
    double getEsfera(){
        return (4/3*(Math.PI*Math.pow(r, 3)));
    }
    
    double getCone(){
        return ((Math.PI*Math.pow(r, 2))*h)/3;
    }
    
    double getPiramide(){
        return ((Math.pow(a, 2)*h)/3);
    }
    
    
        
}
