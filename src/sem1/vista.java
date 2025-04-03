package sem1;

public class vista {
    public static void main(String[] args) {
        Empleado emp= new Empleado("xxxx","yyyy", 13);
        
        emp.pagarSalario();
        
       EmpleadoDAO empdao = new EmpleadoDAO();
       empdao.guardandoEnBD(emp);
       
       CorreoDeBienvenida empCDB = new CorreoDeBienvenida();
       empCDB.correoBienvenida(emp);
        
    }
    
    
}
