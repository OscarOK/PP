package com.oscarok;

import com.oscarok.proyecto01.Punto;
import com.oscarok.proyecto01.Recta;
import com.oscarok.proyecto01.Triangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Objeto para leer datos desde el teclado
        Scanner lector = new Scanner(System.in);

        // Declaración e instanciación de un triángulo
        Triangulo t = new Triangulo();

        System.out.println("Altura: ");
        t.setAltura(lector.nextFloat());

        System.out.println("Base: ");
        t.setBase(lector.nextFloat());

        System.out.println("Área: " + t.getArea());

        Recta r = new Recta();
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        // Captura de datos para los puntos
        System.out.println("X0: ");
        p1.setX(lector.nextFloat());

        System.out.println("Y0: ");
        p1.setY(lector.nextFloat());

        System.out.println("X1: ");
        p2.setX(lector.nextFloat());

        System.out.println("Y1: ");
        p2.setX(lector.nextFloat());

        // Asignación de puntos al segmento de recta
        r.setP1(p1);
        r.setP2(p2);

        System.out.println("Pediente: " + r.getPendiente());
    }
}
