import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        for (int resultado : generarTablaMultiplicar(8)) {
            System.out.println(resultado);
        }
    }

    public static int[] generarTablaMultiplicar(int numero){
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }


}
