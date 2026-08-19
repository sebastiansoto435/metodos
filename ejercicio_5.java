import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args) {

        System.out.println(calcularPromedio(5.0,3.0));

        double[] notas = {4.0, 4.5, 5.0, 4.5};
        System.out.println(calcularPromedio(notas));
    }

    public static double calcularPromedio(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
    public static double calcularPromedio(double[] notas) {
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        return suma / notas.length;
    }


}
