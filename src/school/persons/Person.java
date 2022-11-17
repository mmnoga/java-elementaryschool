package school.persons;

import school.helpers.Address;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    protected String name;
    protected String surname;
    String gender;
    protected LocalDate birthDate;
    Address address;
    String phone;

    public Person(String name, String surname, String gender, LocalDate birthDate, Address address, String phone) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
    }

    public void getFullName() {
        System.out.println(name + surname);
    }

    int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
