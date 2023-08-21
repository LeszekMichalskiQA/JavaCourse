package CourseMaterial;


public class SecondsToHours {
    public static void main(String[] args) {
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(59, 59));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        } else {
            return "Seconds parameter is less then 0!";
        }
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return String.format("%s h %02d m %02d s", hours, remainingMinutes, seconds);
        } else {
            return String.format("Seconds or Minutes parameter is not within range!, Seconds is - %s, Minutes is - %s ",  seconds, minutes);
        }
    }
}
