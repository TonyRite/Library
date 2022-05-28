package LMS;
//import static LMS.Library.librarian;
//import static LMS.Library.persons;
public class Librarian extends Staff{
    int officeNo; //librarian office
    public static int currentOfficeNumber = 0;

    public Librarian(int idNum, String name, String address, int phoneNo, double salary, int officeNo)
    {
        super(idNum, name, address, phoneNo, salary);
        if(officeNo == -1)
            this.officeNo = currentOfficeNumber;
        else
            this.officeNo = officeNo;
        this.officeNo = officeNo;
    }

    //printing librarian info


    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Office number: "+ officeNo);
    }

//    public boolean addLibrarian(Librarian lib)
//    {
//        //one Library can have only one Librarian
//        if (librarian == null) {
//            librarian = lib;
//            persons.add(Librarian);
//            return true;
//        } else
//            System.out.println("\nSorry, the library already has one librarian. New Librarian can't be created.");
//        return false;
//    }
}
