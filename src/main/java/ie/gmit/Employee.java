package ie.gmit;

public class Employee {

    private String name; //name
    private String phone; //phone number
    private String number; //employee number
    private String age; //employee number



    public Employee(String name, String phone, String number, String age)
    {
        this.name = name;
        this.phone = phone;
        this.number = number;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getNumber(){
        return number;
    }
    public String getAge(){
        return age;
    }

}
