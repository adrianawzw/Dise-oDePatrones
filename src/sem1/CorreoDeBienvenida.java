package sem1;

import javax.swing.JOptionPane;

public class CorreoDeBienvenida {
    public void correoBienvenida(Empleado obj){
        JOptionPane.showMessageDialog(null, "enviando correo a: "+obj.getNombre()+" "+obj.getApellido());
    }
}
