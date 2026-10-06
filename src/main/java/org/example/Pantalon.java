package org.example;

public class Pantalon extends Prenda {
    private TipoPantalon tipoPantalon;

    // constructor
    public Pantalon(double precio, Talla talla, Material material, TipoPantalon tipoPantalon) {
        super(precio, talla, material);
        this.tipoPantalon = tipoPantalon;
    }

    // getters y setters

    public TipoPantalon getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(TipoPantalon tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    // metodo calcular descuento
    @Override
    public double calcularDescuento() {
        return 15;
    }
}
