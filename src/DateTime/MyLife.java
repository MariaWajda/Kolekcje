package DateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MyLife {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(1997, 4, 15, 14, 23);

        System.out.println(Math.abs(now.until(birthday, ChronoUnit.MINUTES)));
    }
}
