/*
*
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
* de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
*@author Yolanda Serrano
 */

public class ejer3 {
  public static void main(String[] args) throws Exception {
    int palos = (int) (Math.random() * 4);
    int numbaraja = (int) ((Math.random() * 12) + 1);
    String carta;
    switch (numbaraja) {
      case 10:
        carta = "Sota";
        break;
      case 11:
        carta = "Caballo";
        break;
      case 12:
        carta = "Rey";
        break;

      default:
        carta = String.valueOf(numbaraja);
        break;

    }
    switch (palos) {
      case 0:// picas
        System.out.println("Es:   " + carta + " oros");

        break;
      case 1:// corazones
        System.out.println("Es:   " + carta + " bastos");

        break;
      case 2:// diamante
        System.out.println("Es:  " + carta + " espadas");

        break;
      case 3:// tréboles
        System.out.println("Es: el " + carta + " copas");

        break;

    }
  }
}
