public class Main {
    public static void main(String[] args) {
        Marks marks = new Marks(75, 80, 90);

        RegularThesis regularThesis = new RegularThesis("CSE");
        RegularNonThesis regularNonThesis = new RegularNonThesis("SWE");

        System.out.println("Regular Thesis Marks : " + regularThesis.getMarks(marks));
        System.out.println("Regular Non-Thesis Marks : " + regularNonThesis.getMarks(marks));

        System.out.println("Regular Thesis Eligibility : " + regularThesis.isEligible(3.5, "CSE"));
        System.out.println("Regular Non-Thesis Eligibility : " + regularNonThesis.isEligible(3.5, "SWE"));
    }
}