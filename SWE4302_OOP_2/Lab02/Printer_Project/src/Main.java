public class Main {
    public static void main(String[] args) {

        String Text = "The world needs to be Purged";
        String NullText = "";

        EpsonPrinter epsonDefault = new EpsonPrinter(2, "A4");
        CanonPrinter canonDefault = new CanonPrinter(1, "A3");

        PrintController.printDoc(epsonDefault, Text);
        PrintController.printDoc(canonDefault, Text);

        EpsonPrinter epsonCustom = new EpsonPrinter(2, "A1", "CYAN");
        CanonPrinter canonCustom = new CanonPrinter(2, "A5", "YELLOW");

        PrintController.printDoc(epsonCustom, NullText);
        PrintController.printDoc(canonCustom, NullText);
    }
}