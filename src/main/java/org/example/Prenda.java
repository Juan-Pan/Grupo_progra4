package org.example;

public class Prenda {
    private double precio;
    private Talla talla;
    private Material material;

    // constructor
    public Prenda(double precio, Talla talla, Material material) {
        this.precio = precio;
        this.talla = talla;
        this.material = material;
    }

    // getters y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    // metodo caluclar_descuento
    public double calcularDescuento() {
        return 0;
    }
    public double precioFinal(){
        return getPrecio() - getPrecio() * (calcularDescuento() / 100);
    }

}

