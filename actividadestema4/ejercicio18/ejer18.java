public class ejer18 {
    // Escribe un programa que diga cuál es la primera cifra de un número entero
    // introducido por teclado. Se permiten números de hasta 5 cifras.
    public static void main(String[] args) {
        System.out.println("Digame un nuemero cualquiera");
        System.out.print("=>");
        int cifra = Integer.parseInt(System.console().readLine());
        if ((cifra <= 9)) {
            System.out.println("La primera cifra es " + cifra);
        }
        if ((cifra >= 10) && (cifra < 100)) {
            System.out.println("La primera cifra es " + (cifra / 10));
        }
        if ((cifra >= 100) && (cifra < 1000)) {
            System.out.println("La primera cifra es " + (cifra / 100));
        }
        if ((cifra >= 1000) && (cifra < 10000)) {
            System.out.println("La  primera cifra es " + (cifra / 1000));
        }
        if ((cifra >= 10000) && (cifra < 100000)) {
            System.out.println("La primera cifra es " + (cifra / 10000));

        }

    }
}
