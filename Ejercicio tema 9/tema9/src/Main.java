public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Pedro", 18, "572390570", 3000);
        Trabajador trabajador = new Trabajador("Victor", 25, "574905776", 4500);

        System.out.println("El nombre del cliente es : "+cliente.getNombre());
        System.out.println("La edad del trabajador es : "+trabajador.getEdad());
        System.out.println("El teléfono del trabajador es : "+trabajador.getTelefono());

        System.out.println("--------------------------------");

        System.out.println("modifico el crédito del cliente");
        cliente.setCredito(21000);
        System.out.println("Ahora el crédito del cliente es de: "+ cliente.getCredito());

    }


    }

