public class CalculateData {

    public int calculateAverageAge(String[][] data) {
        int totalAge = 0;
        for (String[] entry : data) {
            int age = Integer.parseInt(entry[2]);
            totalAge += age;
        }
        return totalAge / data.length;
    }

    public void printResult(int averageAge) {
        System.out.println("Average age: " + averageAge);
    }
}
