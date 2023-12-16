import java.util.Objects;

public class EpsonPrinter implements Print {

    private int _sides;
    private String _pageType;
    private String _color;

    public EpsonPrinter(int sides, String pageType) {
        this._sides = sides;
        this._pageType = pageType;
        this._color = "B/W";
    }

    public EpsonPrinter(int sides, String pageType, String color) {
        this._sides = sides;
        this._pageType = pageType;
        this._color = color;
    }

    public String getDefaultColor() {return _color;}
    public String getPrinterName() {return "Epson";}

    @Override
    public boolean printPage(String content) {
        if(!Objects.equals(content, "")){
            System.out.println("Type " + _pageType + " Sides: " + _sides + " printed by " + getPrinterName() + " printed in " + getDefaultColor());
            System.out.println(content);
            return true;
        } else {
            System.out.println("Invalid Content");
            return false;
        }
    }
}
