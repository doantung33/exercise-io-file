import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private static final String FILE_PATH="exercise.dat";
    public static void write(List<Preson>presons){
        FileOutputStream fileOutputStream= null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(presons);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Preson>read(){
        List<Preson>list=new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            list=(List<Preson>)objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }return list;
    }
}
