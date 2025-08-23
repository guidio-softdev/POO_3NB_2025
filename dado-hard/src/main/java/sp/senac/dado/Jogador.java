package sp.senac.dado;

public class Jogador {
    private String nome;
    private int vidas;

    public Jogador(String nome) {
        this.nome = nome;
        this.vidas = 5;
    }

    public int rolarDado(Dado dado) {
        int valor = dado.rolar();

        if (valor % 2 == 0) {
            ganharVida();
        } else if (! (vidas % 2 == 0) ){
            perderVida();
        }
        return valor;

    }

    public void ganharVida() {
        if (vidas <5){
           vidas += 1;
        }
    }

    public void perderVida() {
        if (vidas > 0){
        vidas -= 1;
        }
    }

    public boolean estaVivo() {

        return vidas >0;

    }

    public String getNome() {
        return nome;
    }

    public int getVidas() {
        return vidas;
    }
}
