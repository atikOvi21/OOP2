package MultipleObjects;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductSerializationManager {
    private final String fileName;

    public ProductSerializationManager(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(List<Object> objectList) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(objectList);
            out.close();
            fileOut.close();
            System.out.println(STR. "Serialized data is saved in \{ fileName }" );
        } catch (IOException ex) {
            System.out.println(STR. "Error : \{ ex }" );
        }
    }

    @SuppressWarnings("unchecked")
    public List<Object> deserialize() {
        List<Object> objectList = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            objectList = (List<Object>) objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println(STR. "Error : \{ ex }" );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return objectList;
    }

}
