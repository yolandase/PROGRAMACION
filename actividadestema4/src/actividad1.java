public class actividad1 {
    // Escribe un programa que pida por teclado un día de la semana y que diga qué
    // asignatura toca a primera hora ese día.
    public static void main(String[] args) throws Exception {
        System.out.println("¿Que clase te toca a primera?");
        System.out.println("----------------------------");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves ");
        System.out.println("5. Viernes ");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.print("\n Elija una opción (1-7):");
        int diaSemana = Integer.parseInt(System.console().readLine());

        switch (diaSemana) {
            case 1:
                System.out.println("El lunes a primera tiene Entorno de desarrolo");
                break;
            case 2:
                System.out.println("El martes a primera tiene digitalización");
                break;
            case 3:
                System.out.println("El miercoles a primera tiene lenguaje de marca (LMSGI)");
                break;
            case 4:
                System.out.println("El jueves a primera tiene lenguaje de marca (LMSGI)");
                break;
            case 5:
                System.out.println("El viernes a primera tiene base de datos");
                break;
            case 6, 7:
                System.out.println("Ese dia no tiene clases ☺");
                break;

            default:
                System.out.println("\033[1;31mNO EXISTEN MAS DIAS EN LA SEMANA\033[0m");
                break;
        }

    }
}
