package org.example.modelos;

public class Herramienta {

    private String nombre;
    private Double dañoCausado; //0-100

    public Herramienta( ) {
    }

    public Herramienta(String nombre, Double dañoCausado) {
        this.nombre = nombre;
        this.dañoCausado = dañoCausado;
    }
}
