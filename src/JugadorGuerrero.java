public class JugadorGuerrero extends Jugador {
    public JugadorGuerrero() {
        super("Guerrero");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada.");
    }
}
