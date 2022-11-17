package school.helpers;

public class TimeTable {
    static String hour[] = {"7.00-8.00", "8.00-8.45", "8.55-9.40", "9.50-10.35", "10.55-11.40", "11.50-12.35", "12.50-13.35", "13.45-14.30", "14.40-15-25"};

    public static void getLessonHour(int id) {
        System.out.println(hour[id]);
    }
}
