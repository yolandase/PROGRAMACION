public class ejer3 {
    // Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
    // diente nombre del día de la semana.
    public static void main(String[] args) throws Exception {
        System.out.println("¿Que dia de la semana quieres saber?");
        System.out.println("_______________________________");
        System.out.print("Introduzca un numero(1-7): ");
        int diasemana = Integer.parseInt(System.console().readLine());

        switch (diasemana) {
            case 1:
                System.out.println(" Hoy es lunes");
                break;
            case 2:
                System.out.println(" Hoy es martes");
                break;
            case 3:
                System.out.println(" Hoy es miercoles");
                break;
            case 4:
                System.out.println(" Hoy es jueves");
                break;
            case 5:
                System.out.println(" Hoy es viernes");
                break;
            case 6:
                System.out.println(" Hoy es sabado");
                break;
            case 7:
                System.out.println(" Hoy es domingo");
                break;
            default:
                System.out.println("No hay mas dias en la semana");
                break;
        }

    }
}
