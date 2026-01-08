import java.util.Scanner;

public class U1R2E9 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("¿cuantos caramelos tienes? ");
        int numCaramelos = scanner1.nextInt();
        System.out.print("¿Cuántos niños hay a repartir? ");
        int numNinios = scanner1.nextInt();
        int restoCalculoCaramelos = numCaramelos % numNinios;
        int caramelosARepartir = numCaramelos / numNinios;
        // Lo mando a la consola y hago el calculo
        System.out.print("Se reparten " + caramelosARepartir + " a cada niño y sobran " + restoCalculoCaramelos + " caramelos");
    }
}