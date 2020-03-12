package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.CancelledKeyException;

public class EmployeeListTest {

    Employee myEmployee;
    EmployeeList myList;

    @BeforeEach
    void setup()
    {
        myEmployee = new Employee("Jack", "08444", "234", "27");
        myList = new EmployeeList();
    }

    @Test
    void testAddEmployee()
    {
        myList.addEmployee(myEmployee);
        assertEquals(1, myList.getSize());
    }

    @Test
    void testFindbyNameEmployee()
    {
        myList.addEmployee(myEmployee);
        assertEquals(myEmployee, myList.findByName("Jack"));
    }
}
