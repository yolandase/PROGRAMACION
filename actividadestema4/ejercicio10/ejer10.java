public class ejer10 {
    public static void main(String[] args) {
        System.out.println("HOROSCOPO");
        System.out.println("__________________________________________________________");
        System.out.print("Digame el mes de tu nacimiento(1-12): ");
        int mesnacimiento = Integer.parseInt(System.console().readLine());
        System.out.print("Digame que dia nacio(1-31): ");
        int dianacimiento = Integer.parseInt(System.console().readLine());
        switch (mesnacimiento) {
            case 1:
                if (dianacimiento <= 19) {
                    System.out.println("Eres capricornio");

                } else {
                    System.out.println("Eres Acuario");
                }
                break;
            case 2:
                if (dianacimiento <= 18) {
                    System.out.println("Eres Acuario");
                } else {
                    System.out.println("Eres Piscis");

                }
                break;
            case 3:
                if (dianacimiento <= 20) {
                    System.out.println("Eres Piscis");

                } else {
                    System.out.println("Eres Aries");

                }
                break;
            case 4:
                if (dianacimiento <= 19) {
                    System.out.println("Eres Aries");

                } else {
                    System.out.println("Eres Tauro");

                }
                break;
            case 5:
                if (dianacimiento <= 20) {
                    System.out.println("Eres Tauro");

                } else {
                    System.out.println("Eres Geminis");

                }
                break;
            case 6:
                if (dianacimiento <= 20) {
                    System.out.println("Eres Geminis");

                } else {
                    System.out.println("Eres Cancer");

                }

                break;
            case 7:
                if (dianacimiento <= 22) {
                    System.out.println("Eres Cancer");

                } else {
                    System.out.println("Eres Leo ");

                }

                break;
            case 8:
                if (dianacimiento <= 22) {
                    System.out.println("Eres Leo");

                } else {
                    System.out.println("Eres Virgo");

                }

                break;
            case 9:
                if (dianacimiento <= 22) {
                    System.out.println("Eres Virgo");

                } else {
                    System.out.println("Eres Libra");

                }

                break;
            case 10:
                if (dianacimiento <= 22) {
                    System.out.println("Eres Libra");

                } else {
                    System.out.println("Eres Escorpio");

                }

                break;
            case 11:
                if (dianacimiento <= 21) {
                    System.out.println("Eres Escorpio");

                } else {
                    System.out.println("Eres Sagitario");

                }
                break;
            case 12:
                if (dianacimiento <= 21) {
                    System.out.println("Eres Sagitario");

                } else {
                    System.out.println("Eres Capricornio");

                }
                break;

            default:
                System.out.println("LO INTRODUCIDO ES INCORRECTO");
                break;
        }

    }
}
