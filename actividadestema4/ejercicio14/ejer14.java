public class ejer14 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero para saber si es par y/o divisible entre 5");
        System.out.print("=>");
        int NUMEROS = Integer.parseInt(System.console().readLine());
        if (NUMEROS == 0) {
            System.out.println("El 0 no se puede ser par ni divisible entre 5");
            if ((NUMEROS % 2) == 0) {

                System.out.print("Este numero es par y ");

            } else {
                System.out.print("Este numero es impar y ");
            }
            if ((NUMEROS % 5) == 0) {
                System.out.println(" este numero es divisible entre 5");

            } else {
                System.out.println("este numero no es divisible entre 5");
            }

        }

    }
}
