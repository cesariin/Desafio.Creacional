class FabricaMago extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new JugadorMago();
    }
}