package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee>list;

    public EmployeeList(){
        list = new ArrayList<Employee>();
    }

    public void addEmployee(Employee myEmployee)
    {
        list.add(myEmployee);
    }

    public void deleteEmployee(Employee myEmployee)
    {
        list.add(myEmployee);
    }


    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Employee findByNumber(String name)
    {
        for(Employee employee : list)
        {
            if(employee.getName().equals(name))
            {
                return employee;
            }
        }
        return null;
    }
}
