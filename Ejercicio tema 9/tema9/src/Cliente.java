public class Cliente extends Persona{
    private Integer credito;

    public Cliente(String nombre, Integer edad, String telefono, Integer credito) {
        super(nombre, edad, telefono);
        this.credito=credito;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }
}
