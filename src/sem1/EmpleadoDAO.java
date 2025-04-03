package sem1;

import javax.swing.JOptionPane;

public class EmpleadoDAO {
    public void guardandoEnBD(Empleado obj){
        JOptionPane.showMessageDialog(null, "guardando a: "+obj.getNombre());
    }
}
