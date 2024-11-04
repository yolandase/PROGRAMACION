public class ejer6 {
    //Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
   //una altura h. Aplica la fórmula t =√2hg siendo g = 9.81m/s
  public static void main(String[] args) {
    double gravedad=9.81;
    System.out.println("Calculadora de que tiempo tardará en caer un objeto");
    System.out.println("__________________________________________________________");
    System.out.print("Introduzca la altura(En metros):");
    double altura = Double.parseDouble(System.console().readLine());
    double tiempo= Math.sqrt(2*altura/gravedad);
    System.out.printf("El objeto tarda %.2f segundos en caer.\n",tiempo);
  } 
    
}
