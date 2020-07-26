import java.util.Arrays;
import java.util.List;

public class Ans {
    public static void main(String[] args) {
        String[] answer = mostFrequendWeekdays(1785);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    public static String[] mostFrequendWeekdays(int year){
        if (year <=0 ) {
            return null;
        }
        List<String> daysOfWeek = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thuesday","Friday","Saturday");
        boolean leapYear = false;
        int numberFinishAddDays = 1;
        if ( year%4 == 0 ){
            leapYear = true;
            numberFinishAddDays = 2;
        }
        String[] mostFrequendWeekdays = new String[numberFinishAddDays];
        String DayStartYear;
        int howMuchYearsDifference;
        int DaysDeffirence;
        int DifferenceInDaysOfOneWeek;
        if(year>2016){
            howMuchYearsDifference = year - 2016; // Friday(6) - 01.01.2016
        }
        else{
            howMuchYearsDifference = 2016 - year;
        }
        DaysDeffirence = howMuchYearsDifference - (howMuchYearsDifference/4) + (howMuchYearsDifference/4) * 2;
        DifferenceInDaysOfOneWeek = DaysDeffirence%7;
        int NumberOfTheDayOfTheWeek;
        if(year>2016) {
            NumberOfTheDayOfTheWeek = (6 + DifferenceInDaysOfOneWeek)%7;
        }
        else {
            NumberOfTheDayOfTheWeek = (Math.abs( 6 - DifferenceInDaysOfOneWeek))%7;
        }
        if (leapYear == false) {
            mostFrequendWeekdays[0] = daysOfWeek.get(NumberOfTheDayOfTheWeek);
            return mostFrequendWeekdays;
        }
        mostFrequendWeekdays[0] = daysOfWeek.get(NumberOfTheDayOfTheWeek);
        mostFrequendWeekdays[1] = daysOfWeek.get(NumberOfTheDayOfTheWeek+1);

        return mostFrequendWeekdays;

    }
}
