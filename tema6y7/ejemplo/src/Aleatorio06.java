/**
 * Generación de números aleatorios.
 *
 * @author Luis José Sánchez
 */
public class Aleatorio06 {
    public static void main(String[] args) {
        System.out.println("Genera al azar piedra, papel o tijera:");
        //si quiero hacer trucarlo debo poner mas casos y ponerle que salga el que 
       //quiero que salga mas 
        int mano = (int) (Math.random() * 5); // genera un número al azar
        // entre 0 y 4 ambos incluidos

        switch (mano) {
            case 0:
                System.out.println("piedra");//1/5
                break;
            case 1:
                System.out.println("papel");//1/5
                break;
                //luego habrá mas posibilidad de que salga tijera 
               //concretamente 3/5 mas de posibilidad
            case 2,3,4:
                System.out.println("tijera");
                break;
            default:
        }
    }
}
