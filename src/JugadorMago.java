class JugadorMago extends Jugador {
    public JugadorMago() {
        super("Mago");
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo.");
    }
}
