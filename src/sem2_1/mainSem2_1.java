package sem2_1;

public class mainSem2_1 {
    public static void main(String[] args) {
        Notificador notEmail = new NotificadorEmail();
        Notificador notSMS = new NotificadorSMS();
        
        notEmail.enviarNotificacion("mensaje email enviado");
        notSMS.enviarNotificacion("mensaje SMS enviado");
    }
}
