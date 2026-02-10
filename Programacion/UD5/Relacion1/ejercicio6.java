
public class ejercicio6 {

    public static void main(String[] args) {
        Reloj Reloj1 = new Reloj(12, 45, 16);
        Reloj1.hacerHora();
        System.out.println(Reloj1.horaDelDia);
    }
}

class Reloj {

    int hora;
    int minuto;
    int segundo;
    String horaDelDia;

    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    void hacerHora() {
        horaDelDia = hora + ":" + minuto + ":" + segundo;

    }
}