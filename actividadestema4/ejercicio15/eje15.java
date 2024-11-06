public class eje15 {
   public static void main(String[] args) {
      System.out.println("Piramide de formas : ");
      System.out.println("__________________________________________________________");
      System.out.println("Indique con que caracter quiere la piramide");
      System.out.print("=>");
      String señal = System.console().readLine();
      System.out.println("1. Hacia arriba ^: ");
      System.out.println("2. Hacia abajo v : ");
      System.out.println("3. Hacia izquierda <: ");
      System.out.println("4. Hacia derecha > :");
      System.out.println("Indique con un numero hacia que direccion quiere la piramide ");
      System.out.print("=>");
      int Numeros = Integer.parseInt(System.console().readLine());
      switch (Numeros) {
         case 1:
            System.out.println("   " + señal);
            System.out.println("  " + señal + señal);
            System.out.println(" " + señal + señal + señal);
            System.out.println(señal + señal + señal + señal);
            break;
         case 2:
            System.out.println(" "+señal + señal + señal + señal);
            System.out.println(" " + señal + señal + señal);
            System.out.println(" " + señal + señal);
            System.out.println(" " + señal);
            break;
         case 3:
            System.out.println("    " + señal);
            System.out.println("  " + señal + " " + señal);
            System.out.println(señal + " " + señal + " " + señal);
            System.out.println("  " + señal + " " + señal);
            System.out.println("    " + señal);
            break;
         case 4:
            System.out.println(señal);
            System.out.println(señal + " " + señal);
            System.out.println(señal + " " + señal + " " + señal);
            System.out.println(señal + " " + señal);
            System.out.println(señal);
            break;

      }

   }
}
