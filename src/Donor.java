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
    public String getName()
    {
        return name;
    }
    public String getBloodGroup()
    {
        return bloodgroup;
    }
    public int getAge()
    {
        return age;
    }
    public boolean isAvailable()
    {
        return available;
    }
}
