package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creando objetos

        Samurai samurai=new Samurai();
        Samurai samuraiDos=new Samurai();

        Herramienta herramienta= new Herramienta( "Escopeta", 90.0);
        Herramienta herramientaDos= new Herramienta();
        Scanner entradaPorTeclado= new Scanner(System.in);

        //Utilizar-Acceder-Ver-Modificar-Operar-Revisar-Validar
        //Los atributos y metodos de una clase

        samurai.setNombres("Koshito micamoto ");
        System.out.print("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());

        System.out.println("****RESTULTADOS****");
        System.out.println("El samurai: " +samurai.setNombres()+ "Tiene: " +samurai.setEdad());
    }
}