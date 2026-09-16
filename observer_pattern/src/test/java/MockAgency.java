import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MockAgency implements Agency {

    List<Object> receivedNotifications = new ArrayList<>();
    List<Object> expectedNotifications = new ArrayList<>();

    @Override
    public void update(Object notification) {
        this.receivedNotifications.add(notification);
    }

    public void expect(Object notification) {
        this.expectedNotifications.add(notification);
    }

    public void verify() {
        assertEquals(expectedNotifications, receivedNotifications);
    }


}
