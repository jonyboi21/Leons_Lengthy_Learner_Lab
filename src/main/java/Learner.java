public interface Learner {
    public default void learn(double numberOfHours){
    }


    public default double getTotalStudyTime() {
        return 0;
    }



}
