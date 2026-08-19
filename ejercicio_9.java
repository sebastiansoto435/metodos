public class ejercicio_9 {
    public static void main(String[] args) {
        System.out.println(clasificarNota(2.1));
    }

    public static String clasificarNota(double nota){
        if (nota <= 2.9){
            return "reprobado";
        }else if (nota <= 4.0){
            return "aprobado";
        }else{
            return "Excelente";
        }
    }


}
