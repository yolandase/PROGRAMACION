/*
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
 *dos por espacios.
* 
*
*@author Yolanda Serrano
*
*
 */


public class ejer4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Va a mostrar por pantalla 20 numeros aleatorio de 0-10: ");
        
        for (int i = 0; i < 20; i++) {
            int numeros= (int)((Math.random()*10)+1);
            System.out.print(numeros+" , ");
            
        }
    }
}
