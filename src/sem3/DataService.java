/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem3;

public class DataService {
    private DataStorage objdataStorage;

    public DataService(DataStorage objdataStorage) {
        this.objdataStorage = objdataStorage;
    }
    
    public void saveData(String data){
        objdataStorage.saveData(data);
    }
    
    public String getData(){
        return objdataStorage.getData();
    }
}
