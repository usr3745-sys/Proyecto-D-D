import net.salesianos.guerrero.Guerrero;
import net.salesianos.mago.Mago;
import net.salesianos.personaje.Personaje;

public class App {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero("Aragorn", 10, 100, "Espada de Andúril");
        Mago m1 = new Mago("Gandalf", 12, 80, "Fuego de Anor");

        g1.atacar();
        m1.atacar();

        // Acceso estático (PDF Estáticos)
        System.out.println("Total de personajes creados: " + Personaje.totalPersonajes);
    }
}