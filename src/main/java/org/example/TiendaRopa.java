package org.example;


import java.util.List;

public class TiendaRopa {
    public static void main(String[] args) {
        List<Prenda> prendas = List.of(
                new Abrigo(100.0, Talla.M, Material.Cuero, TipoAbrigo.Cazadora),
                new Camiseta(50.0, Talla.L, Material.Poliéster, TipoManga.Corta),
                new Abrigo(150.0, Talla.XL, Material.Lana, TipoAbrigo.chaqueta),
                new Pantalon(80.0, Talla.S, Material.Mezclilla, TipoPantalon.Jeans)
        );
        System.out.println("Bienvenido a la tienda de ropa\n");

        for (Prenda prenda : prendas) {
            System.out.println("Prenda: " + prenda.getClass().getSimpleName());
            System.out.println("Precio original: " + prenda.getPrecio());
            System.out.println("Tiene descuento de: " + prenda.calcularDescuento() + "%");
            System.out.println("Precio con descuento: " + prenda.precioFinal());
            System.out.println();
        }
    }
}
