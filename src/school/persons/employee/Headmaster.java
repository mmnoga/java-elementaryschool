package school.persons.employee;

import school.helpers.Address;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Headmaster extends Employee implements Hired {

    public Headmaster(String name, String surname, String gender, LocalDate birthDate, Address address, String phone, float salary, String employmentType) {
        super(name, surname, gender, birthDate, address, phone, employmentType);
    }

    public BigDecimal getSalary() {
        return this.salary;
    }
}
