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
}
