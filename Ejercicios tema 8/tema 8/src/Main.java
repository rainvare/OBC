public class Main {
    public static void main(String[] args) {

        Persona persona1= new Persona("Juanita", 18, "572390570");

        System.out.println("El nombre de la persona es : "+persona1.getNombre());
        System.out.println("La edad de la persona es : "+persona1.getEdad());
        System.out.println("El teléfono de la persona es : "+persona1.getTelefono());

        System.out.println("--------------------------------");

        System.out.println("modifico la edad de la persona");
        persona1.setEdad(21);
        System.out.println("Ahora la edad de la persona es: "+ persona1.getEdad());

    }
}
