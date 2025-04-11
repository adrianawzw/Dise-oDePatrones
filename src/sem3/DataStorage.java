package sem3;

//principio de inversion de dependencia
public interface DataStorage {
    public void saveData(String data);
    String getData();
}
