package school.persons;

import school.helpers.Address;
import school.helpers.Class;

import java.time.LocalDate;

public class Student extends Person {

    Class.grade grade;

    public Student(String name, String surname, String gender, LocalDate birthDate, Address address, String phone, Class.grade grade) {
        super(name, surname, gender, birthDate, address, phone);

        this.grade = grade;
    }
}
