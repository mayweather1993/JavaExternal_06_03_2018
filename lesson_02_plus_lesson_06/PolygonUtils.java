import java.io.*;

public class PolygonUtils {

    public static boolean write(Drawable figure, String name) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(name);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(figure);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static Drawable read(String name) {
        Drawable figure = null;
        try (FileInputStream fileInputStream = new FileInputStream(name);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            figure = (Drawable) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return figure;
    }



}