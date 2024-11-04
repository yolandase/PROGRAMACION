public class ejer2 {
    // Realiza un programa que pida una hora por teclado y que muestre luego buenos
    // días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
    // de
    // 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
    // horas, los minutos no se deben introducir por teclado.
    public static void main(String[] args) throws Exception {
        System.out.println("Digame una hora del dia");
        System.out.println("_______________________________");
        System.out.print("Introduzca aqui la hora: ");
        double hora = Double.parseDouble(System.console().readLine());
        if (hora > 00 && hora < 24) {

            if (hora >= 6 && hora < 11.59) {
                System.out.println("\033[1;36m¡Buenos días!\033[0m");
            } else if (hora >= 12 && hora < 21.59) {
                System.out.println("\033[1;33m¡Buenas tardes!\033[0m");
            } else {
                System.out.println("\033[1;35m¡Buenas noches!\033[0m");
            }
        }else{
            System.out.println("\033[42mNO EXISTEN MAS HORAS\033[0m");
        }
    }

}
