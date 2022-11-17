package school.persons.employee;

import school.helpers.Address;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Janitor extends Employee implements Hired{
    public Janitor(String name, String surname, String gender, LocalDate birthDate, Address address, String phone, String employmentType) {
        super(name, surname, gender, birthDate, address, phone, employmentType);
    }

    public BigDecimal getSalary() {
        return this.salary.divide(BigDecimal.valueOf(3));
    }
}
