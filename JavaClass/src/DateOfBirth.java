import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOfBirth {

    public void daysLived(String dateString) throws ParseException {

        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = formatter.parse(dateString);
        //System.out.println(date);

        LocalDate currDate = LocalDate.now();
        Instant instant = currDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        long numDays  = ChronoUnit.DAYS.between(date.toInstant(), instant );
        System.out.println("You have lived "+ numDays + " days");

    }


}
