public class Car {
    private String _name;
    private String _model;
    private String _numberPlate;

    // Constructor
    public Car(String name, String model, String numberPlate) {
        this._name = name;
        this._model = model;
        this._numberPlate = numberPlate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getModel() {
        return _model;
    }

    public void setModel(String model) {
        this._model = model;
    }

    public String getNumberPlate() {
        return _numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this._numberPlate = numberPlate;
    }

    public String getCarInfo() {
        return "Vehicle Information:\n" +
                "Name: " + getName() + "\n" +
                "Model: " + getModel() + "\n" +
                "Number Plate: " + getNumberPlate();
    }
}
