package sem2_1;

import javax.swing.JOptionPane;

public class NotificadorEmail implements Notificador{

    @Override
    public void enviarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
