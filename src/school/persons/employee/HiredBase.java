package school.persons.employee;

import java.math.BigDecimal;

public class HiredBase implements Hired {
    public BigDecimal getSalary() {
        return BigDecimal.valueOf(2000);
    }
}
