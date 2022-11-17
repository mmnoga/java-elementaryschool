package school.persons.employee;

import java.math.BigDecimal;

abstract class HiredDecorator implements Hired {
    protected Hired tempHired;

    public HiredDecorator(Hired newHired) {
        tempHired = newHired;
    }

    public BigDecimal getSalary() {
        return tempHired.getSalary();
    }
}
