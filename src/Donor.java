public class Donor {
    private String name;
    private String bloodgroup;
    private int age;
    public Donor(String name,String bloodgroup,int age)
    {
        this.name=name;
        this.bloodgroup=bloodgroup;
        this.age=age;
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
}
