
public class student 
{
    
    String name;
    private String ID;
    double GBA;
    private subject s;
    private address a;

    public student()
    {
        
    }

    public student(String name, String ID, subject s, address a)
    {
        this.name = name;
        this.ID = ID;
        this.s = s;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() 
    {
        return ID;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public double getGBA()
    {
        return GBA;
    }

    public void setGBA(double GBA) 
    {
        this.GBA = GBA;
    }

    public subject getS() 
    {
        return s;
    }

    public void setS(subject s) 
    {
        this.s = s;
    }

    public address getA()
    {
        return a;
    }

    public void setA(address a) 
    {
        this.a = a;
    }

   
   
    
    
}
