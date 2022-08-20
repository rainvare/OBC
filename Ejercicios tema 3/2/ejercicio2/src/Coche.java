public class Coche {
    public Integer puertas;

    public Coche(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer aumentarPuertas() {
        puertas += 1;
        return puertas;
    }
}
