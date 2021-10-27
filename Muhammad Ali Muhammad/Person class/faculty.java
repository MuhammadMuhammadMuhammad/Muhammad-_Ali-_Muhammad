
public class faculty extends employee
{
 private double huors;
 private String rank;

    public faculty() 
    {
        
    }

    public faculty(double huors, String rank, double salary, MyDate d, String name, String phoneNumber, String address, String emailAddress) 
    {
        super(salary, d, name, phoneNumber, address, emailAddress);
        this.huors = huors;
        this.rank = rank;
    }
    
 @Override
      public void display()
   {
       System.out.println("The class name : faculty\nThe person name : "+super.getName());
   }
 
}
