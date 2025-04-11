/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem3;

/**
 *
 * @author tapia
 */
public class Principal {
    public static void main(String[] args) {
        DataStorage archivoAlmacenamiento = new FileStorage();
        DataStorage bdAlmacenamiento = new DatabaseStorage();
        
        
        //usar el servicio de datos data service
        DataService objservicio = new DataService(archivoAlmacenamiento);
        objservicio.saveData("M00025 Juanito Perez");
        System.out.println(objservicio.getData());
    }
}
