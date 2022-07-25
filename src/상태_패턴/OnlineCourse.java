package 상태_패턴;

import java.util.List;

public class OnlineCourse {
    private State state;

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    private List<Student> students;
    private List<String> reviews;

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.students.add(student);
        if (this.students.size() > 1) {

        }
    }

    public void changeState(State state) {
        this.state = state;
    }
}
