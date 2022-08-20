public class Trabajador extends Persona{
    private Integer salario ;

    public Trabajador(String nombre, Integer edad, String telefono, Integer salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
