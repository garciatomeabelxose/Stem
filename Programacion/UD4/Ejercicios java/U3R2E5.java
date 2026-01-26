import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class U3R2E5 {
    public static detectarPalabrasClave(ArrayList<String> arrayMensaje, int posicion, ArrayList<String> arrayInformacion) {


        System.out.println(arrayMensaje.get(posicion)+arrayInformacion);
    }

    public static void main(String[] args) {
        final String TEXTO = "Me gusta programar en Python y Java";
        final ArrayList<String> PALABRASCLAVE = new ArrayList<>(Arrays.asList("python", "java", "c++"));
    }
}