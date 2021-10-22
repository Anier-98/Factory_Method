package org.anier;

import java.awt.*;

public abstract class Formas  {
    int lado = 0;

    public Formas(int lado)
    {
        this.lado = lado;
    }
    public abstract double getArea();

    public void dibujar(Graphics G, int X, int Y) {
    }
}


