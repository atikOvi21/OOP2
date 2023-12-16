public class Main {
    public static void main(String[] args) {

//        ParseCSV csvParser = new ParseCSV();
//        String[][] parsedData = csvParser.parseCSV("The DATA");

        ParseExcel excelParser = new ParseExcel();
        String[][] parsedData = excelParser.parseExcel("The DATA");

        CalculateData calculateData = new CalculateData();
        int averageAge = calculateData.calculateAverageAge(parsedData);
        calculateData.printResult(averageAge);
    }
}
