package school.persons.employee;

import school.helpers.Address;
import school.persons.Person;

import java.time.LocalDate;

public abstract class Employee extends Person {
    String employmentType;

    public Employee(String name, String surname, String gender, LocalDate birthDate, Address address, String phone, String employmentType) {
        super(name, surname, gender, birthDate, address, phone);
        this.employmentType = employmentType;
    }

}
