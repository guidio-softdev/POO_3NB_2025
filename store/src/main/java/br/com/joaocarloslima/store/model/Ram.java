package br.com.joaocarloslima.store.model;

public class Ram extends Componente{

    private TipoMemoria tipo;
    private int tamanhoGb;

    public Ram(long id, String nome, int consumo, double preco, TipoMemoria tipo, int tamanhoGb) {
        super(id, nome, consumo, preco);
        this.tipo = tipo;
        this.tamanhoGb = tamanhoGb;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }
}
