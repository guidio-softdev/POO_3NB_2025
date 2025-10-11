package br.com.joaocarloslima.store.model;

public abstract class Componente {

    private Long id;
    private String nome;
    private int consumo;
    private Double preco;

    public Componente(long id, String nome, int consumo, double preco) {
        this.id = id;
        this.nome = nome;
        this.consumo = consumo;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getConsumo() {
        return consumo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}