package school.persons.employee;

import java.math.BigDecimal;

public class InternshipAllowance extends HiredDecorator {

    public InternshipAllowance(Hired newHired) {
        super(newHired);

        System.out.println("Adding base salary");
        System.out.println("Adding Intership Allowance (1000)");
    }

    public BigDecimal getSalary() {
        return tempHired.getSalary().add(BigDecimal.valueOf(1000));
    }
}
