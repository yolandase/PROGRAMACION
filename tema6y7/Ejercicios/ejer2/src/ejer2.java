/*
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
*francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
*y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
*numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
*1). Para convertir un número en una cadena de caracteres podemos usarString.valueOf(n).
*
*
*
*@author Yolanda Serrano
 */

public class ejer2 {

    public static void main(String[] args) throws Exception {
        int palos = (int) (Math.random() * 4);
        int numerosBaraja = ((int) (Math.random() * 13) + 1);
        String carta;
        switch (numerosBaraja) {
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;

            default:
                carta = String.valueOf(numerosBaraja);
                break;
        }
        //intentar hacer ina variable para los palos de la carta

        switch (palos) {
            case 0:// picas
                System.out.println("Es:  el " + carta + " picas");

                break;
            case 1:// corazones
                System.out.println("Es: el  " + carta + " corazones");

                break;
            case 2:// diamante
                System.out.println("Es: el " + carta + " diamante");

                break;
            case 3:// tréboles
                System.out.println("Es: el " + carta + " treboles");

                break;

        }
    }
}
