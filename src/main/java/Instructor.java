public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learner.length;
        for(int i=0; i<learner.length; i++){
            learner[i].learn(numberOfHoursPerLearner);
        }
    }



}
