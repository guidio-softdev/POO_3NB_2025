package br.senac.sp.batalha;

public class Jogador {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Jogador(String nome, int vidas, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vidas;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void receberDano(int dano) {
        this.vida = this.getVida() - dano;

        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public String atacar (Jogador inimigo){

        int dano = this.ataque - inimigo.getDefesa();
        double chanceCritico = Math.random();
        boolean critico = false;

        if (dano < 0){
            dano = 0;
        }

        if (chanceCritico <= 0.10) {
            dano *= 2;
            critico = true;
        }

        inimigo.receberDano(dano);

        String msg = this.nome+" atacou "+inimigo.getNome()+" e causou "+dano+" de dano.";

        if (critico){
            msg = "ATAQUE CRITICO! "+this.nome+" atacou "+inimigo.getNome()+" e causou "+dano+" de dano.";
        }


        return msg;

    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
}
