package org.example;

public class Prenda {
    private double precio;
    private String talla;
    private String material;

    // constructor
    public Prenda(double precio, String talla, String material) {
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // metodo caluclar_descuento
    public double calcularDescuento(double porcentaje, double precio, boolean descuento)
    {
        if (descuento) {
            return precio - (precio * porcentaje / 100);
        } else {
            return precio;
        }
    }

}

