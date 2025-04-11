package sem3;

public class FileStorage implements DataStorage{

    @Override
    public void saveData(String data) {
        //simulacion de almacenamiento de archivo
        System.out.println("guardando datos en archivo "+data);
    }

    @Override
    public String getData() {
        //simulacion de recuperacion de datos
        return "Datos de archivo";
    }
    
}
