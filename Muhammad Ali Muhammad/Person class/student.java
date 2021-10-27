
public class student extends person
{
    final private  status s=new status(true,false,true,false);

    public student() 
    {
        
    }

    public student(status s, String name, String phoneNumber, String address, String emailAddress) 
    {
        super(name, phoneNumber, address, emailAddress);
    }
    
    @Override
     public void display()
   {
       System.out.println("The class name : student\nThe person name : "+super.getName());
   }
}
