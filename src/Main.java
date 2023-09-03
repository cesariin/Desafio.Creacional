public class Main {
    public static void main(String[] args) {
        FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
        Personaje jugadorGuerrero = fabricaGuerrero.crearPersonaje();

        FabricaPersonajes fabricaMago = new FabricaMago();
        Personaje jugadorMago = fabricaMago.crearPersonaje();

        FabricaEnemigos fabricaEnemigoNormal = new FabricaEnemigoNormal();
        Enemigo enemigoNormal = fabricaEnemigoNormal.crearEnemigo();

        jugadorGuerrero.atacar();
        jugadorMago.atacar();
        enemigoNormal.atacar();

        enemigoNormal.recibirDaño(20);
        jugadorGuerrero.recibirDanio(30);
    }
}