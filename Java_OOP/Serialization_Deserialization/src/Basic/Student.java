package Basic;

import java.io.Serial;
import java.io.Serializable;

import static java.lang.StringTemplate.STR;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int id;
    private final String name;
    private final String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return STR."Student[id= \{id}, name= \{name}, address= \{address}]";
    }
}
