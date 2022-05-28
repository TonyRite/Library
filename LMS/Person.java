package LMS;

public class Person
{
    protected int id;
  //  protected String password;
    protected String name;
    protected String address;
    protected int phoneNo;

    static int currentIdNumber =0;  //This will be unique for every person, since it will be incremented when everytime
    //when a person is created


    public Person(int idNum, String name, String address, int phoneNo)
    {
        currentIdNumber++;
        if(idNum == -1)
        {
            id = currentIdNumber;
        }
        else
            id = idNum;
        this.name = name;
        this.address= address;
        this.phoneNo = phoneNo;
    }
    //printing info of the person
    public void printInfo()
    {
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println("\nThe details are: \n");
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Phone no: "+ phoneNo);
    }
    //setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }
/*'''''''''''''''''''''*/
    //getters

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public  int getId()
    {
        return id;
    }
    /*;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;*/
    public static  void setIDCount(int n)
    {
        currentIdNumber=n;
    }
}
