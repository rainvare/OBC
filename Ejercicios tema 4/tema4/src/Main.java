public class Main {
    public static void main(String[] args) {


        Integer numeroIf = 67;

        System.out.println("Este numero es " + numeroIf);

        if (numeroIf == 0) {
            System.out.println("Este número es igual a cero");
        } else if (numeroIf > 0) {
            System.out.println("Este número es positivo");
        } else {
            System.out.println("Este número es negativo");
        }
        ;
        System.out.println("--------------------------------------------------------------");

        Integer numeroWhile = 3;

        while (numeroWhile < 4) {
            System.out.println("Num: " + numeroWhile + ". Es menor a 4");
            numeroWhile = numeroWhile + 1;
            System.out.println("Ahora, el num es igual a " + numeroWhile);
        }

        System.out.println("--------------------------------------------------------------");

        Integer numeroWhile2 = 3;

        do {
            System.out.println("Num: " + numeroWhile2);
            numeroWhile2 = numeroWhile2 + 1;
        } while (numeroWhile2 > 4);

        for (Integer numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numeroFor es " + numeroFor);
        }
        ;

        System.out.println("--------------------------------------------------------------");

        String estación = "zaraza";


        switch (estación) {
            case "primavera":
                System.out.println("Ahora la estación es: primavera");
            case "verano":
                System.out.println("Ahora la estación es: verano");
            case "otoño":
                System.out.println("Ahora la estación es: otoño");
            case "invierno":
                System.out.println("Ahora la estación es: invierno");
            default:
                System.out.println("Esto no es una estación");
        }


    }


}
