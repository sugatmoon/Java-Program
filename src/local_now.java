import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class local_now {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);

    }
}
