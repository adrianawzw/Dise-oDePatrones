/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem3;

/**
 *
 * @author tapia
 */
public class DatabaseStorage implements DataStorage{

    @Override
    public void saveData(String data) {
        //simulacion de almacenamiento en base de datos
        System.out.println("guardando datos en la base de datos "+data);
    }

    @Override
    public String getData() {
        //simulacion de la recuperacion de datos de la base de datos
        return "Datos de la BD";
    }
    
}
