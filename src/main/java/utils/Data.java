package utils;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Data {
    public static final String MONDAY = "Monday";
    public static final String TUESDAY = "Tuesday";
    public static final String WEDNESDAY = "Wednesday";
    public static final String THURSDAY = "Thursday";
    public static final String FRIDAY = "Friday";
    public static final String SATURDAY = "Saturday";
    public static final String SUNDAY = "Sunday";

    public static String listGenerator(List<Integer> numbers){
        return numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }
}
