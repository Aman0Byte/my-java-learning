class  Employee {
    int id;
    String name;
    int Salary;
    public void printDetails() {
        System.out.println("My id is "+ id );
        System.out.println("My name  is "+ name );
    }
     public int getSalary() {
       return Salary;
     }
     }
public class _38_creating_own_custom_class {
    public static void main(String[] args) {
        System.out.println("THIS IS OUR CUSTOM CLASS");
        Employee aman = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object
       // setting Attributes for Aman
        aman.id=12;
        aman.Salary= 50;
        aman.name="Aman_Agrawal";
        // setting Attributes for John
        john.id=34;
        john.Salary=40;
        john.name="John Tripathi";
        // Printing the Attributes
aman.printDetails();
john.printDetails();
int salary= john.getSalary();
        System.out.println(salary);
      //  System.out.println(aman.id);
        //System.out.println(aman.name);


    }
}
