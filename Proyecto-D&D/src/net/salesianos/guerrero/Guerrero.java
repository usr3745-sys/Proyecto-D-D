package net.salesianos.guerrero;
import net.salesianos.personaje.Personaje;

public class Guerrero extends Personaje {
    private String arma;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma) {
        super(nombre, nivel, puntosVida); 
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su " + arma + " causando un gran daño físico.");
    }
}