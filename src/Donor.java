public class Donor {
    private String name;
    private String bloodgroup;
    private int age;
    private boolean available;
    public Donor(String name,String bloodgroup,int age,boolean available)
    {
        this.name=name;
        this.bloodgroup=bloodgroup;
        this.age=age;
        this.available=available;
    }
    public String getname()
    {
        return name;
    }
    public String getbg()
    {
        return bloodgroup;
    }
    public int getage()
    {
        return age;
    }
    public boolean isAvailable()
    {
        return available;
    }
}
