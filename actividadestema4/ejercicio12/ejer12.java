public class ejer12 {

    public static void main(String[] args) {
        int puntos = 0;
        String respuesta;
        System.out.println("Mini cuestionario");
        System.out.println("__________________________________________________________");
        System.out.println("¿Qué es un bucle infinito?");
        System.out.println(" a.) Un bucle que se repite un número fijo de veces. b.) Un bucle que nunca termina.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("¿Qué es una clave primaria en una base de datos?");
        System.out.println(
                " a. Un campo que contiene valores duplicados. b. Un campo único que identifica de manera exclusiva cada registro.");
        System.out.print("=>");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("¿Qué es un wireframe?");
        System.out.println( "a. Una herramienta para la gestión de proyectos. b. Un esquema visual básico de una interfaz de usuario.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println(" ¿Qué es la virtualización?");
        System.out.println(" a. La creación de una versión virtual de algo, como un sistema operativo o un servidor. b. La eliminación de copias de seguridad.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) {
            puntos++;
        }
        System.out.println("¿Para qué se utiliza HTML?");
        System.out.println("a. Para diseñar la estructura de una página web. b. Para crear bases de datos.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) {
            puntos++;
        }
        System.out.println("¿Qué es un IDE?");
        System.out.println(" a. Un tipo de sistema operativo. b. Un entorno de desarrollo integrado que facilita la programación");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("¿Qué es SQL?");
        System.out.println(" a. Un lenguaje de programación para desarrollo de videojuegos. b. Un lenguaje para gestionar y manipular bases de datos relacionales.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("¿Qué es un plan de negocio?");
        System.out.println("a. Un documento que detalla los objetivos y estrategias de una empresa. b. Un resumen de actividades diarias de una empresa.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) {
            puntos++;
        }
        System.out.println(" ¿Qué se debe incluir en un currículum vitae?");
        System.out.println(" a. Información personal irrelevante. b. Experiencia laboral relevante y formación académica");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("¿Qué es una API?");
        System.out.println("a. Una red social. b. Un conjunto de funciones y procedimientos que permite a las aplicaciones interactuar con otras.");
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
            puntos++;
        }
        System.out.println("Ha obtenido " + puntos + " puntos.");
    }
}
