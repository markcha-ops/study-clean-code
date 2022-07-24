package 중재자_패턴;


import java.time.LocalDateTime;

public class Guest {
    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();
    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }
    public void setId(Integer id) {
        this.id = id;
    }
    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }
    public Integer getId() {
        return id;
    }
}
