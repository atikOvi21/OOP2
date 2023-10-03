public class RegularThesis extends MastersProgram implements IEligibility, IMarks{
    private final DegreeType degreeType = DegreeType.RegularThesis;

    public RegularThesis(String major) {
        super(major);
    }

    @Override
    public boolean isEligible(double cgpa, String major) {
        return this.major.equals(major) && cgpa >= 3.0;
    }

    @Override
    public int getMarks(Marks marks) {
        return marks.TheoryMarks + marks.ThesisMarks;
    }
}
