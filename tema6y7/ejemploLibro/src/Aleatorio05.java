/**
 * Generación de números aleatorios.
 *
 * @author Luis José Sánchez
 */
public class Aleatorio05 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
        for (int i = 1; i <= 20; i++) {
            //usamos la formula (int)(math.ramdom()*(b-a+1))+a 
           //siendo el intervalo que quiero [a=50,b=60]
            System.out.print(((int) (Math.random() * 11) + 50) + " ");
        }
    }
}