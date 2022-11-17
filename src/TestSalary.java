import school.helpers.Address;
import school.persons.employee.*;

import java.time.LocalDate;

public class TestSalary {
    public static void main(String[] args) {

        //Teacher
        Address address = new Address("11-222", "Kraków", "Basztowa", "14A");
        Teacher biologyTeacher = new Teacher("John", "Smith", "male", LocalDate.of(1966, 3, 16), address, "12 332 11 22", "contract of employment", "biology");
        biologyTeacher.getFullName();
        System.out.println("Basic salary: " + biologyTeacher.getSalary());
        System.out.println("Salary with Discretionary Bonus: " + new DiscretionaryBonus(biologyTeacher).getSalary());
        System.out.println("Salary with Intership Allowance: " + new InternshipAllowance(biologyTeacher).getSalary());
        System.out.println("Salary with Discretionary Bonus and Intership Allowance: " + new DiscretionaryBonus(new InternshipAllowance((biologyTeacher))).getSalary());

        //Nurse
        Address address2 = new Address("22-111", "Wieliczka", "Jagiellońska", "3/6");
        Nurse nurse = new Nurse("Suzan", "Adams", "female", LocalDate.of(1972, 1, 19), address, "12 666 22 88", "half part time");
        nurse.getFullName();
        System.out.println("Basic salary: " + nurse.getSalary());
        System.out.println("Salary with Discretionary Bonus: " + new DiscretionaryBonus(nurse).getSalary());
    }
}
