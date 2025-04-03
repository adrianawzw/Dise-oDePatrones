package sem2;

public class EmpleadoMedioTiempo implements Empleado{

    @Override
    public double calcularSalario() {
        return 1500;
    }

    @Override
    public String getNombre(String nombre) {
        return nombre;
    }

    
}
