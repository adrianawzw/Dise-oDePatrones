package sem2;

public class mainSem2 {
 
    public static void main(String[] args) {
        Empleado empCont = new EmpleadoContratista();
        Empleado empMed = new EmpleadoMedioTiempo();
        Empleado empComp = new EmpleadoTiempoCompleto();
        
        System.out.println("Empleado Contratista "+empCont.getNombre("Juan")+" sueldo: "+empCont.calcularSalario());
        System.out.println("Empleado Medio Tiempo "+empMed.getNombre("Jose")+" sueldo: "+empMed.calcularSalario());
        System.out.println("Empleado Tiempo Completo "+empComp.getNombre("Jesus")+" sueldo: "+empComp.calcularSalario());
    }
}
