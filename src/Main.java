import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String opcion = "";

        do {

            System.out.println("Maneras de copiar o clonar");
            System.out.println("1. Shallow Copy");
            System.out.println("2. Deep Copy");
            System.out.println("0. Salir");

            System.out.print("Introduzca una opción: ");
            opcion = entrada.nextLine();

            switch (opcion) {

                case "1":
                    copiaPocaProfunda();
                    break;

                case "2":
                    copiaMuyProfunda();
                    break;

            }

        }while (!opcion.equals("0"));

        System.out.println("Gracias por su atención.");

    }

    public static void copiaPocaProfunda() {

        Alumno alumno1 = new Alumno("17171494", "Manuel");
        Alumno alumno2 = alumno1;

        System.out.println("Antes de modificar");

        System.out.println(alumno1);
        System.out.println(alumno2);

        alumno2.setNombre("Sahir");
        alumno2.setNumeroControl("16171193");

        System.out.println("Después de modificar");

        System.out.println(alumno1);
        System.out.println(alumno2);

    }

    public static void copiaMuyProfunda() {

        try {

            AlumnoMCC alumno1 = new AlumnoMCC("M17171494", "Manuel");
            AlumnoMCC alumno2 = (AlumnoMCC) alumno1.clone();

            System.out.println("Antes de modificar");

            System.out.println(alumno1);
            System.out.println(alumno2);

            alumno2.setNombre("Sahir");
            alumno2.setNumeroControl("M16171193");

            System.out.println("Después de modificar");

            System.out.println(alumno1);
            System.out.println(alumno2);

        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}