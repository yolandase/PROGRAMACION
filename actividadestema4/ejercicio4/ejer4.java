public class ejer4 {
    // Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    // las horas extras. Escribe un programa que calcule el salario semanal de un
    // trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    // trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
    // euros
    // la hora.
    public static void main(String[] args) throws Exception {
        int sueldoSemanal;
        System.out.println("SALARIO SEMANAL");
        System.out.println("_______________________________");
        System.out.print(" Por favor, introduzca el número de horas trabajadas durante la semana:");
        int HoraDuranteSemana = Integer.parseInt(System.console().readLine());
        System.out.println("__________________________________________________________");
        if (HoraDuranteSemana < 40) {
            sueldoSemanal = 12 * HoraDuranteSemana;

        } else {
            sueldoSemanal = (40*12)+ (16 * (HoraDuranteSemana-40));
        }
        System.out.println("El sueldo semanal que le corresponde es de " + "\033[4;33m"+sueldoSemanal+"\033[0m" + " euros ");
    }
}