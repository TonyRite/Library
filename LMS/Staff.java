package LMS;

public class Staff extends Person{
   protected double salary;

    public Staff(int idNum, String name, String address, int phoneNo, double salary)
    {
        super(idNum, name, address, phoneNo);
        this.salary = salary;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Salary: "+ salary);
    }
    public double getSalary()
    {
        return salary;
    }
}
