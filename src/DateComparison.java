import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void compareDates(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate inputDate = LocalDate.parse(input, formatter);

        LocalDate currentDate = LocalDate.now();

        if (inputDate.getYear() != currentDate.getYear()) {
            System.out.println("Year is different: " + inputDate.getYear() + " (input) vs " + currentDate.getYear() + " (current)");
        }
        if (inputDate.getMonth() != currentDate.getMonth()) {
            System.out.println("Month is different: " + inputDate.getMonth() + " (input) vs " + currentDate.getMonth() + " (current)");
        }
        if (inputDate.getDayOfMonth() != currentDate.getDayOfMonth()) {
            System.out.println("Day is different: " + inputDate.getDayOfMonth() + " (input) vs " + currentDate.getDayOfMonth() + " (current)");
        }
    }
}