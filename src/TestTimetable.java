import school.helpers.Address;
import school.helpers.Subject;
import school.persons.employee.Teacher;
import school.rooms.Classroom;
import school.timetable.Lesson;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestTimetable {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        Address address = new Address("11-222", "Kraków", "Basztowa", "14A");
        teachers.add(new Teacher("John", "Smith", "male", LocalDate.of(1966, 3, 16), address, "12 332 11 22", 5400, "contract of employment", "biology"));

        System.out.println(teachers.get(0).toString());

        Classroom classroom = new Classroom(103, "Biology Classroom", 30);
        Lesson lesson = new Lesson(DayOfWeek.MONDAY, teachers.get(0), new Subject("biology"), classroom);
    }
}
