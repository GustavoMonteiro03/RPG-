public interface Personagem {
    String getNome();
    int getVida();
    void setVida(int vida);
    int getAtaque();
    void setAtaque(int ataque);

    void atacar(Personagem alvo);
}
