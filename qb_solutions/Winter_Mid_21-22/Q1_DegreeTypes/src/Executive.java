public class Executive extends MastersProgram implements IEligibility, IMarks{
    public Executive(String major) {
        super(major);
    }

    @Override
    public boolean isEligible(double cgpa, String major) {
        // Executive Implementation
        return false;
    }

    @Override
    public int getMarks(Marks marks) {
        // Executive Implementation
        return 0;
    }
}
