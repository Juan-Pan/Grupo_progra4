package org.example;

public class Camiseta extends Prenda {
    private TipoManga tipoManga;

    // constructor
    public Camiseta(double precio, Talla talla, Material material, TipoManga tipoManga) {
        super(precio, talla, material);
        this.tipoManga = tipoManga;
    }

    public TipoManga getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(TipoManga tipoManga) {
        this.tipoManga = tipoManga;
    }

    // metodo calcular_descuento
    @Override
    public double calcularDescuento() {
        return 10;
    }
}
