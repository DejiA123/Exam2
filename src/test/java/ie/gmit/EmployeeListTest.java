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

    void testDeleteEmployee()
    {
        myList.deleteEmployee(myEmployee);
        assertEquals(0, myList.getSize());
    }

    @Test
    void testFindbyNumberEmployee()
    {
        myList.addEmployee(myEmployee);
        assertEquals(myEmployee, myList.findByNumber("Jack"));
        assertEquals("234", myEmployee.getNumber());
        
    }
}
