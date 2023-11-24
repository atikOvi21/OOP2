package LibrarySerialization;

import java.io.*;

public class SerializationManager {
    private final String path;

    public SerializationManager(String path) {
        this.path = path;
    }

    public void serialize(Object object) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            System.out.println(STR."Object serialized and saved in \{path}");

        } catch (IOException e) {
            System.out.println(STR."Error while serializing object: \{e.getMessage()}");
        }
    }

    public Object deserialize() {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(STR."Error while deserializing object: \{e.getMessage()}");
            return null;
        }
    }
}
