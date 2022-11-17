package school.persons.employee;

import java.math.BigDecimal;

public class DiscretionaryBonus extends HiredDecorator {
    public DiscretionaryBonus(Hired newHired) {
        super(newHired);

        System.out.println("Adding Discretionary Bonus (500)");
    }

    public BigDecimal getSalary() {
        return tempHired.getSalary().add(BigDecimal.valueOf(500));
    }
}
