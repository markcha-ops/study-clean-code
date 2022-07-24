package 중재자_패턴;

import java.time.LocalDateTime;

// 레디에이터 역할 (중재자)
public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();
    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
