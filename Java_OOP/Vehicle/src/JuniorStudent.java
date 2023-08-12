public class JuniorStudent extends Student{
    private  int _ears;
    private  int _legs;

    public int get_ears() {
        return _ears;
    }

    public void set_ears(int _ears) {
        this._ears = _ears;
    }

    public int get_legs() {
        return _legs;
    }

    public void set_legs(int _legs) {
        this._legs = _legs;
    }

    public  JuniorStudent(int id, String name, String dateOfBirth, String classList, int ears, int legs){
        super(id, name, dateOfBirth, classList );
        this._ears = ears;
        this._legs = legs;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
