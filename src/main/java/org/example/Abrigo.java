package org.example;

public class Abrigo extends Prenda {
    private TipoAbrigo tipoAbrigo;

    // Constructor
    public Abrigo(double precio, Talla talla, String material, TipoAbrigo tipoAbrigo) {
        super(precio, talla, material);
        this.tipoAbrigo = tipoAbrigo;
    }
    // getters y setters

    public TipoAbrigo getTipoAbrigo() {
        return tipoAbrigo;
    }

    public void setTipoAbrigo(TipoAbrigo tipoAbrigo) {
        this.tipoAbrigo = tipoAbrigo;
    }

    // metodo calcular descuento
    @Override
    public double calcularDescuento()
    {
        return getPrecio() * 0.2;
    }
}
