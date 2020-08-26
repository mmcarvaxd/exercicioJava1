package classes;

import java.util.Random;

public class Dispositivo {
    protected int ip;
    protected String nomeDoDispositivo;
    
    public String getNomeDoDispositivo() {
        return nomeDoDispositivo;
    }

    public void setNomeDoDispositivo(String value) {
        nomeDoDispositivo = value;
    }

    public int getIp() {
        return ip;
    }

    public void ping(Dispositivo outroDispositivo) {
        System.out.println("Ping to " + this.nomeDoDispositivo + " - "+ this.ip + ", responding " + outroDispositivo.getNomeDoDispositivo()+"!");
        outroDispositivo.pong(this);
    }

    protected void pong(Dispositivo outroDispositivo) {
        System.out.println("Pong to " + this.nomeDoDispositivo + " - "+ this.ip + ", responding " + outroDispositivo.getNomeDoDispositivo()+"!");
    }

    public String status() {
        Random a = new Random();
        int value = a.nextInt(10);

        if(value < 5) {
            return "Offline";
        }

        return "Online";
    }

    public Dispositivo(int ip, String nomeDoDispositivo) {
        this.ip = ip;
        this.nomeDoDispositivo = nomeDoDispositivo;
    }
}