import java.time.temporal.ChronoUnit;
import java.time.*;

public class durationTime{
    public static void main(String[] args) {
        durationTime durationTime=new durationTime();
        durationTime.testPeriod();
        durationTime.testDuration();
    }
    public void testPeriod(){
        LocalDate date=LocalDate.now();
        System.out.println("Current date:"+date);

        LocalDate date2=date.plus(45,ChronoUnit.DAYS); //Today plus 45 days
        System.out.println("Next month:"+date2);
        Period period=Period.between(date2,date);
        System.out.println("Period:"+period);

    }
    public void testDuration(){
        LocalTime time1=LocalTime.now();
        Duration twoHours=Duration.ofHours(2);
        LocalTime time2=time1.plus(twoHours);
        Duration duration=Duration.between(time1,time2);
        System.out.println("Duration:"+duration);

    }
}