import java.util.ArrayList;
public class DonorManager {
    private ArrayList<Donor> donors;

    public DonorManager(){
        donors=new ArrayList<>();
    }

    public void addDonor(Donor donor)
    {
        donors.add(donor);
    }
    public void showAllDonors()
    {
        for(int i=0;i<donors.size();i++)
        {
            Donor d=donors.get(i); //.get is used to access arraylist index element
            System.out.println("Name:"+d.getName());
            System.out.println("Age:"+d.getAge());
            System.out.println("Blood Group:"+d.getBloodGroup());
            System.out.println("Availability:"+d.isAvailable());
            System.out.println("-----------------------------------");
        }
    }
}
