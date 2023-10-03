public class RegularNonThesis extends MastersProgram implements IEligibility, IMarks{
    public RegularNonThesis(String major) {
        super(major);
    }

    @Override
    public boolean isEligible(double cgpa, String major) {
        return this.major.equals(major);
    }

    @Override
    public int getMarks(Marks marks) {
        return marks.TheoryMarks + marks.PracticalMarks /2;
    }
}
