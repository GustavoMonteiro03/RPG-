public class Jogador implements Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int cooldownMagia;

    public Jogador(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.cooldownMagia = 0;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getVida() {
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
        System.out.println(this.getNome() + " atacou " + alvo.getNome() + " causando " + this.getAtaque() + " de dano!");
    }

    public int getCooldownMagia() {
        return cooldownMagia;
    }

    public void setCooldownMagia(int cooldownMagia) {
        this.cooldownMagia = cooldownMagia;
    }

    public void lancarMagia(Personagem alvo) {
        if (cooldownMagia > 0) {
            System.out.println(this.getNome() + " não pode lançar magia ainda. Tempo de recarga da magia: " + cooldownMagia);
            return;
        }

        int danoMagia = this.getAtaque() * 3;
        alvo.setVida(alvo.getVida() - danoMagia);
        System.out.println(this.getNome() + " lançou magia em " + alvo.getNome() + " causando " + danoMagia + " de dano!");
        cooldownMagia = 3;
    }
}