import java.io.*;

public class SerializableUtils {

    public static void serializeFigures(String filename, Serializable figure) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename))) {
            ous.writeObject(figure);
            ous.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T extends Serializable> T deserializeFigures(String filename, Class<T> tClass) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return tClass.cast(ois.readObject());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
