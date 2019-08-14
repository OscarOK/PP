package com.oscarok.proyecto01;

public class Triangulo {
    // Sección de atributos: Propiedades del objeto
    // Encapsulamiento de los atributos
    private float altura;
    private float base;

    // Constructor vacio
    public Triangulo() {}

    // Constructor de la clase: Reserva espacio en memoria para la instancia y estable el estado inicial del objeto.
    public Triangulo(float altura, float base) {
        setAltura(altura);
        setBase(base);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = (altura >= 0) ? altura : -altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = (base > 0) ? base : -base;
    }

    public float getArea() {
        return base * altura / 2f;
    }
}
