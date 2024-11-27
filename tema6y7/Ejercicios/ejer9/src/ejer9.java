public class ejer9 {
    public static void main(String[] args) throws Exception {
        int contador=0;
        int pares=0;
        while (pares!=24) {
             pares= (int)(((Math.random()*49)+1))*2;
            System.out.println(pares+" ");
            contador++;
        }
           
       
          System.out.println("A imprimido: "+contador);
    }
}
