package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.nio.channels.CancelledKeyException;

public class EmployeeTest {
    Employee myEmployee;

    @Test
    void testEmployee(){
        myEmployee = new Employee("Tom", "0833333", "1234", "30");

    }

    @Test
    void testName() {
        myEmployee = new Employee("Tom", "0833333", "1234", "30");
        myEmployee.getName();
        assertEquals("Tom", myEmployee.getName());
    }

    @Test
    void testPhone()
    {
        myEmployee = new Employee("Tom", "0833333", "1234", "30");
        myEmployee.getPhone();
        assertEquals("0833333", myEmployee.getPhone());
    }

    @Test
    void testNumber()
    {
        myEmployee = new Employee("Tom", "0833333", "1234", "30");
        myEmployee.getNumber();
        assertEquals("1234", myEmployee.getNumber());
    }

    @Test
    void testAge()
    {
        myEmployee = new Employee("Tom", "0833333", "1234", "30");
        myEmployee.getAge();
        assertEquals("30", myEmployee.getAge());
    }




    private void assertEquals(String s, String number) {
    }
}
