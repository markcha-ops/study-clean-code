package 상태_패턴;

public interface State {
    void addReview(String review, Student student);
    void addStudent(Student student);
}
