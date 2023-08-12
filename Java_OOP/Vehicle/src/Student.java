public class Student {
    private  int _id;
    private  String _name;
    private  String _dateOfBirth;
    private  String _classList;

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_dateOfBirth() {
        return _dateOfBirth;
    }

    public void set_dateOfBirth(String dateOfBirth) {
        this._dateOfBirth = dateOfBirth;
    }

    public String get_classList() {
        return _classList;
    }

    public void set_classList(String classList) {
        this._classList = classList;
    }

    public Student(int id, String name, String dateOfBirth, String classList) {
        this._id = id;
        this._name = name;
        this._dateOfBirth = dateOfBirth;
        this._classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "_id=" + _id +
                ", _name='" + _name + '\'' +
                ", _dateOfBirth='" + _dateOfBirth + '\'' +
                ", _classList='" + _classList + '\'' +
                '}';
    }
}
