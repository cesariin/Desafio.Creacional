class Jugador implements Personaje {
    String nombre;
    private int vida;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca a un enemigo.");
    }

    @Override
    public void recibirDanio(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }
}
