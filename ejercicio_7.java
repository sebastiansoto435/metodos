public class ejercicio_7 {
    public static void main(String[] args) {
        double[] calificaciones = {4.0, 4.5, 5.0, 4.5};
        System.out.println("El promedio del grupo es: " + calcularPromediosClase(calificaciones));
    }

    public static double calcularPromediosClase(double[] calificaciones) {
        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        return suma / calificaciones.length;
    }


}