package sem2;

public class EmpleadoTiempoCompleto implements Empleado{

    @Override
    public double calcularSalario() {
        return 3000;
    }

    @Override
    public String getNombre(String nombre) {
        return nombre;
    }


    
}
