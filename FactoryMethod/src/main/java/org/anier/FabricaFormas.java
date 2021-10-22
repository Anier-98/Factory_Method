package org.anier;

public class FabricaFormas {

    public static final int CUADRADO = 0;
    public static final int CIRCULO = 1;

    public FabricaFormas() {
    }

    public Formas getFormas(int tipo, int lado)
    {
        return(Formas) (tipo == 0 ? new Cuadrado(lado) : new Circulo(lado));
    }
}
