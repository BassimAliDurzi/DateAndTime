package test;


import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateAndTime {
    public static void main(String[] args) {

        System.out.println("Exercise 1:");
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 2:");
        String custom = today.format(DateTimeFormatter.ofPattern("eeee dd MMMM"));
        System.out.println("Today(custom date): " + custom);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 3:");
        LocalDate lastMonday = LocalDate.of(2023,7,10);
        for(int i = 0; i < 7; i++){
            LocalDate weekDay = lastMonday.plusDays(i);
            System.out.println(weekDay.getDayOfWeek() + ": " + weekDay.format(DateTimeFormatter.ISO_DATE));
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 4:");
        LocalDate isToday = LocalDate.parse("2023-07-11");
        System.out.println("Today(parse method):" +isToday);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 5:");
        DayOfWeek dayOfWeek = LocalDate.of(1945,5,8).getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 6:");
        LocalDate currentDatePlus = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println("Date after 10 years minus 10 months: " + currentDatePlus);
        System.out.println("The month of that date: " + currentDatePlus.getMonth());
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 7:");
        LocalDate myBirthDay = LocalDate.of(1980,7,24);
        Period periodEx7 = Period.between(myBirthDay,currentDatePlus);
        System.out.println("Period from my birthday to currentDatePlus of ex.6: " + periodEx7.getYears() + " years, " + periodEx7.getMonths() + " months, " + periodEx7.getDays() + " days");
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 8:");
        Period period = timeToSpecificDate(today);
        System.out.println(period.getYears() + "  " + period.getMonths() + "  " + period.getDays());
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 9:");
        LocalTime timeNow = LocalTime.now();
        System.out.println("Time now: " + timeNow);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 10:");
        System.out.println("Nanoseconds: " + timeNow.getNano());
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 11:");
        LocalTime timeParse = LocalTime.parse("08:30");
        System.out.println("Time now: " + timeParse);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 12:");
        System.out.println("Time now: " + timeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 13:");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("'Date:' ''yyyy-MM-dd'', 'Time:' ''HH:mm''")));
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 14:");
        String customParseTime = timeParse.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(today.format(DateTimeFormatter.ofPattern("eeee dd")) +" " + customParseTime);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 15:");
        LocalDateTime combiningDateTime = LocalDateTime.of(today,timeNow);
        System.out.println("Combining local tine and local date: " + combiningDateTime);
        System.out.println("-----------------------------------------------------");

        System.out.println("Exercise 16:");
        System.out.println("Local Date: " + localDateTime.toLocalDate());
        System.out.println("Local Time: " + localDateTime.toLocalTime());
        System.out.println("-----------------------------------------------------");


    }
    public static Period timeToSpecificDate(LocalDate today){
        LocalDate specificDate = LocalDate.of(4,7,29);
        return Period.between(specificDate, today);

    }

}
