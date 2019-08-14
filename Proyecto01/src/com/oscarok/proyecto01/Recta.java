package com.oscarok.proyecto01;

public class Recta {
    private Punto p1;
    private Punto p2;

    public Recta() {
    }

    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Recta(float x1, float y1, float x2, float y2) {
        this.p1 = new Punto(x1, y1);
        this.p2 = new Punto(x2, y2);
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public float getLength() {
        return (float) Math.sqrt((p1.getX() + p2.getX()) + (p1.getY() + p2.getY()));
    }

    public float getPendiente() {
        float a = p1.getY() - p2.getY();
        float b = p1.getX() - p2.getX();

        if (b == 0) {
            throw new RuntimeException("Division sobre cero");
        }

        return a / b;
    }
}
