public class ejer6 {
    public static void main(String[] args) throws Exception {
        System.out.println("El adivinador ");
        int adivina = (int)((Math.random()*100)+1);
        int numero=0;
        int oportunidad=5;
       do {
        
       System.out.print("Introduzca un numero: ");
        numero=Integer.parseInt(System.console().readLine());
        System.out.println("Te quedan "+oportunidad+" intentos");
        oportunidad--;
       } while ((oportunidad>=0)&&(numero!=adivina));
          
       if (numero==adivina) {
        System.out.println("FELICIADES HAS ACERTADO!!");
        
       }else{
        System.out.println("Lo siento te has quedado sin oportunidades.El numero era "+adivina);
       }
       
    }
}
