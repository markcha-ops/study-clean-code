package 상태_패턴;

public class Private implements State{

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
        }
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.addStudent(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
        }
    }
}
