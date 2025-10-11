package br.com.joaocarloslima.store.model;

public class PlacaMae extends Componente{

    Socket socket;
    TipoMemoria tipoMemoria;

    public PlacaMae(long id, String nome, int consumo, double preco, Socket socket, TipoMemoria tipoMemoria) {
        super(id, nome, consumo, preco);
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
    }

    public boolean compativel(Cpu cpu){
        return this.socket == cpu.getSocket();
    }
    public boolean compativel(Ram ram){
        return this.tipoMemoria == ram.getTipo();
    }

    public Socket getSocket() {
        return socket;
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setTipoMemoria(TipoMemoria tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }


}
