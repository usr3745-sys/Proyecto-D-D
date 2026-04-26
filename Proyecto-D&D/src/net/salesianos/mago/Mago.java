package net.salesianos.mago;

import net.salesianos.personaje.Personaje;

public class Mago extends Personaje {
    private String hechizo;

    public Mago(String nombre, int nivel, int puntosVida, String hechizo) {
        super(nombre, nivel, puntosVida);
        this.hechizo = hechizo;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza el hechizo " + hechizo + " consumiendo maná.");
    }
}