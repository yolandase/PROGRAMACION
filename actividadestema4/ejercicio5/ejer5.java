public class ejer5 {
    // Realiza un programa que resuelva una ecuación de primer grado
    // (del tipo ax + b = 0).
    public static void main(String[] args) throws Exception {
        System.out.println("Este Realiza un programa que resuelva una ecuación de primer grado del tipo (ax + b = 0).");
        System.out.println("__________________________________________________________");
        System.out.print("Introduzca el valor de a:");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el valor de b:");
        double b = Double.parseDouble(System.console().readLine());

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + (-b / a));
        }

    }
}
