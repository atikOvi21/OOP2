package Basic;

import java.io.*;

public class SerializationManager {
    private final String fileName;

    public SerializationManager(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.flush();
            out.close();
            fileOut.close();
            System.out.println(STR. "Serialized data is saved in \{ fileName }" );
        } catch (IOException ex) {
            System.out.println(STR. "Error : \{ ex }" );
        }
    }

    public Object deserialize() {
        Object obj = null;

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            obj = objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println(STR. "Error : \{ ex }" );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return obj;
    }
}
