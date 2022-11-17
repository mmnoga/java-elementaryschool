package school.timetable;

import school.helpers.Subject;
import school.persons.employee.Teacher;
import school.rooms.Classroom;

import java.time.DayOfWeek;

public class Lesson {
    DayOfWeek day;
    Teacher teacher;
    Subject subject;
    Classroom classroom;

    public Lesson(DayOfWeek day, Teacher teacher, Subject subject, Classroom classroom) {
        this.day = day;
        this.teacher = teacher;
        this.subject = subject;
        this.classroom = classroom;
    }
}
