public class Monster implements Personagem {
    private final String nome;
    private int vida;
    private int ataque;

    public Monster(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getVida () {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }



    @Override
    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - this.getAtaque());
        System.out.println(this.getNome() + " atacou " + alvo.getNome() + " Causou de  " + this.getAtaque() + "Dano!");
    }
}