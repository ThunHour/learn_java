import java.time.*;
import java.time.format.DateTimeFormatter;

public class timeformat {
    public static void main(String[] args) {

        // LocalDate date=LocalDate.now();
        // System.out.println("Current date: "+date);

        // LocalTime time=LocalTime.now();

        // System.out.println("Current time:"+time.getHour()+":"+time.getMinute());

        // LocalDateTime dateTime=LocalDateTime.now();

        // System.out.println("Current time:"+dateTime);

        // DateTimeFormatter dateTimeF=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime current = LocalDateTime.now();
        // String result=current.format(dateTimeF);
        // System.out.println("Format Current date:"+result);
        Month currentMonth = current.getMonth();
        int day, second, hour;
        day = current.getDayOfMonth();
        second = current.getSecond();
        hour = current.getHour();
        System.out.println("Month" + currentMonth);
        System.out.println("Day:" + day);
        System.out.println("Hour:" + hour);
        System.out.println("Second:" + second);
        day = current.getDayOfYear();
        System.out.println("Day of year:" + day);

        int vauleOfMonth=current.getMonthValue();
        System.out.println("value of month:" + vauleOfMonth);

    }
}
