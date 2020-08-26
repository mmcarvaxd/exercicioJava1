import classes.Computador;
import classes.Dispositivo;

public class program {
    public static void main(String[] args) {
        Computador computador = new Computador(123, "Desktop");
        Dispositivo dispositivo = new Dispositivo(124, "Celular");

        computador.ping(dispositivo);

        System.out.println("Status do Computador " + computador.status());
        System.out.println("Status do Celular " + dispositivo.status());
    }
}