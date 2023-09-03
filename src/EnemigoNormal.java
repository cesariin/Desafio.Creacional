class EnemigoNormal implements Enemigo {
    private int vida;

    public EnemigoNormal() {
        this.vida = 50;
    }

    @Override
    public void atacar() {
        System.out.println("El enemigo ataca al jugador.");
    }

    @Override
    public void recibirDaño(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println("El enemigo normal ha sido derrotado.");
        }
    }
}