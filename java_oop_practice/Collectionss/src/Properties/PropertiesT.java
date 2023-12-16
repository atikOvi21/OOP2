package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesT {
    private final Properties table;

    public PropertiesT() {
        table = new Properties();

        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties:");
        listProperties();

        table.setProperty("color", "red");
        System.out.println("After replacing properties:");
        listProperties();

        saveProperties();

        table.clear();

        System.out.println("After clearing properties:");
        listProperties();

        loadProperties();

        Object value = table.getProperty("color");

        if(value != null){
            System.out.println("The color is " + value);
        }else{
            System.out.println("The color is not in table.");
        }
    }

    private void listProperties(){
        Set<Object> keys = table.keySet();

        for(Object key : keys){
            System.out.printf("%s\t%s\n", key, table.getProperty((String) key));
        }

        System.out.println();
    }

    private void loadProperties(){
        try{
            table.load(new FileInputStream("props.dat"));
            System.out.println("After loading properties:");
            listProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveProperties(){
        try{
            table.store(new FileOutputStream("props.dat"), "Sample Properties");
            System.out.println("After saving properties:");
            listProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
