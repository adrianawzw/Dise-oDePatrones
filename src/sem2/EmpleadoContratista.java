package sem2;

public class EmpleadoContratista implements Empleado{

    @Override
    public double calcularSalario() {
       return 2000; 
    }

    @Override
    public String getNombre(String nombre) {
        return nombre;
    }

    
}
