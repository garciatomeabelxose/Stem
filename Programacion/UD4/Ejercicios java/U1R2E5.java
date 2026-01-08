import java.util.Scanner;

public class U1R2E5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("ingresa tu peso: ");
        int peso = scanner1.nextInt();
        double porcentajegravedad = 16.5 / 100;
        double calculoPeso = peso * porcentajegravedad;
        // Lo mando a la consola y hago el calculo
        System.out.print("Tu peso en la luna es de: " + calculoPeso + "KG");
    }
}