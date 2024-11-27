/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *  también la suma total (los puntos que suman entre los tres dados).
 * 
 * 
 * @author Yolanda Serano
 */

public class ejer1 {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        int tirada;

        for (int i = 1; i < 4; i++) {

            tirada = (((int) (Math.random() * 6) + 1));
            suma = suma + tirada;
            System.out.println("Dado " + i + " : " + tirada);

        }
        System.out.println("La suma de las tirada es = "+suma);
    }
}
