public class ejer17 {
   // Escribe un programa que diga cuál es la última cifra de un número entero
  //introducido por teclado.
    public static void main(String[] args) {
        System.out.println(" Introduzca un numero cualquiera:");
        System.out.print("=>");
        int cifra= Integer.parseInt(System.console().readLine());
        //como necesito saber la primera cifra sabiendo el modulo de la division del numero entre 10 
       //podriamos saber la ultima cifra.Por ende no necesitamos if o stwich
       System.out.println("La ultima cifra introducida seria "+(cifra%10));

        
    }
    
}
