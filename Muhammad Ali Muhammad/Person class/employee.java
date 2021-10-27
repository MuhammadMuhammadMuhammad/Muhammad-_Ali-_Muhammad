
public class employee extends person
{
 
    private double salary;
    private MyDate d;

    public employee()
    {
        
    }

    public employee(double salary, MyDate d, String name, String phoneNumber, String address, String emailAddress)
    {
        super(name, phoneNumber, address, emailAddress);
        this.salary = salary;
        this.d = d;
    }

    @Override
     public void display()
   {
       System.out.println("The class name : employee\nThe person name : "+super.getName());
   }
    
}
