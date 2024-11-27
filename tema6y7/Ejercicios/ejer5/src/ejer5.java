public class ejer5 {
    public static void main(String[] args) throws Exception {
        int suma=0;
        int maximo=100;
        int minimo=199;
       
        for (int i = 0; i < 50; i++) {
            int numeros= (int)((Math.random()*100)+100);
            System.out.print(numeros+" ,  ");
            suma+=numeros;
            if (numeros>maximo) {
                maximo=numeros;
            }
            if (numeros<minimo) {
                minimo=numeros;
            }
           
            
        }
        int media=suma/50;
        System.out.println("El numero minimo es : "+minimo+" .El numero maximo es : "+maximo+" .La media es "+media);
    }
}
