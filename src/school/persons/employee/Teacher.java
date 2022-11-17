package school.persons.employee;

import school.helpers.Address;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Teacher extends Employee implements Hired {
    String subject;

    public Teacher(String name, String surname, String gender, LocalDate birthDate, Address address, String phone, float salary, String employmentType, String subject) {
        super(name, surname, gender, birthDate, address, phone, employmentType);

        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + " " + surname + "\n" + "Date of birth: " + birthDate;
    }

}
