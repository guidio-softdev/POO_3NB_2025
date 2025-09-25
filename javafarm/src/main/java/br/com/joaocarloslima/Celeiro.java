package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade = 169;
    private int qtdeBatatas = 30;
    private int qtdeMorangos = 30;
    private int qtdeCenouras = 30;


    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não ha espaço disponível");
        }
        qtdeBatatas += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não ha espaço disponível");
        }
        qtdeMorangos += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Não ha espaço disponível");
        }
        qtdeCenouras += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas < 1) {
            throw new RuntimeException("Não há batatas disponivéis");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras < 1) {
            throw new RuntimeException("Não há Cenouras disponivéis");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos < 1) {
            throw new RuntimeException("Não há Morangos disponivéis");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeMorangos + qtdeCenouras);
    }

    public double getOcupacao() {
        double totalItens = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        return totalItens/capacidade;
    }

    public boolean celeiroCheio() {
        return getOcupacao() == getEspacoDisponivel();
    }


    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }
}
