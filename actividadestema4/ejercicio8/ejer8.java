public class ejer8 {
    // Amplía el programa anterior para que diga la nota del boletín (insuficiente,
    // suficiente, bien, notable o sobresaliente).
    public static void main(String[] args) {
        System.out.println("Bolentin de notas");
        System.out.println("__________________________________________________________");
        System.out.print("Introduzca la nota del 1 trimestre:");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la nota del 2 trimestre:");
        double nota2 = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la nota del 3 trimestre:");
        double nota3 = Double.parseDouble(System.console().readLine());
        double media = (nota1 + nota2 + nota3) / 3;
        if (media > 0 && media < 5) {
            System.out.printf("La media es: %.2f (insuficiente)", media);
           

        } else {
            if (media >=5 && media <= 8) {
                System.out.printf("La media es: %.2f (buena)", media);

            }else{
            System.out.printf("La media es: %.2f (sobresaliente)", media);
            }
        }
    }
}