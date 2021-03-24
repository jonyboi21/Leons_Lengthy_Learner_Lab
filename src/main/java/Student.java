public class Student extends Person implements Learner {

    ///ivar

    private double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime =+ numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public Student(long id, String name) {
        super(id, name);
    }
}
