
public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche(1);

        System.out.println("Mi coche tiene : " + miCoche.puertas + " puertas. ");
        System.out.println("Aumento puertas ...");
        System.out.println(String.valueOf(miCoche.aumentarPuertas()));
        System.out.println("Ahora mi coche tiene : " + miCoche.puertas + " puertas.");

        System.out.println("Aumento puertas ...");
        System.out.println(String.valueOf(miCoche.aumentarPuertas()));
        System.out.println("Ahora mi coche tiene : " + miCoche.puertas + " puertas.");

        System.out.println("Aumento puertas ...");
        System.out.println(String.valueOf(miCoche.aumentarPuertas()));
        System.out.println("Ahora mi coche tiene : " + miCoche.puertas + " puertas.");

    }
}
