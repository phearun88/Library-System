package utils;

import java.time.LocalDate;
import java.time.Period;

public class Utils {

    public static int calculateLateDays(LocalDate dueDate) {
        Period period = Period.between(dueDate, LocalDate.now());
        return period.getDays();
    }

}
