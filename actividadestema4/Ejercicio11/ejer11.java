public class ejer11 {
    public static void main(String[] args) {
        System.out.print("Digame que hora es ahora mismo( sin los minutos): ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Digame los minutos: ");
        int minutos= Integer.parseInt(System.console().readLine());
         int minutosSegundo= minutos*60;
        double horasegundo= hora *3600;
        double segundoshastamedianoche= (24*3600)- (horasegundo+minutosSegundo);
        System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche faltan " +segundoshastamedianoche+ " segundos.");
    }

}
