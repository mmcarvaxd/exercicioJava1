package classes;

public class Computador extends Dispositivo {
    
    @Override
    public void ping(Dispositivo outroDispositivo) {
        System.out.println("Ping computer " + this.nomeDoDispositivo + " - "+ this.ip + ", responding " + outroDispositivo.getNomeDoDispositivo()+"!");
        outroDispositivo.pong(this);
    }

    public Computador(int ip, String nomeDoDispositivo) {
        super(ip, nomeDoDispositivo);
    }
    
}