package net.salesianos.personaje;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public static int totalPersonajes = 0;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        totalPersonajes++; 
    }

    public void atacar() {
        System.out.println(nombre + " realiza un ataque base.");
    }
}