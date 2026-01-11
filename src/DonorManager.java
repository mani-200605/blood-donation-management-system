
import java.io.*;
import java.util.*;


public class DonorManager {

    private ArrayList<Donor> donors;

    public DonorManager() {
        donors = new ArrayList<>();
    }

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public void showAllDonors() {
        for (int i = 0; i < donors.size(); i++) {
            Donor d = donors.get(i); //.get is used to access arraylist index element
            System.out.println("Name:" + d.getName());
            System.out.println("Age:" + d.getAge());
            System.out.println("Blood Group:" + d.getBloodGroup());
            if(d.isAvailable())
            {
                System.out.println("Avalability: Yes");
            }
            else{
                System.out.println("Availability: No");
            }
            System.out.println("-----------------------------------");
        }
    }

    public void searchByBloodGroup(String bloodgroup) {
        int found=0;
        for (int i = 0; i < donors.size(); i++) {
            Donor d = donors.get(i);
            if (d.getBloodGroup().equalsIgnoreCase(bloodgroup)) {
                found=1;
                System.out.println("Name:" + d.getName());
                System.out.println("Age:" + d.getAge());
                System.out.println("Blood Group:" + d.getBloodGroup());
                if(d.isAvailable())
            {
                System.out.println("Avalability: Yes");
            }
            else{
                System.out.println("Availability: No");
            }
                System.out.println("-----------------------------------");
            }
        }
        if(found!=1)
        {
            System.out.println("The Donor with blood group "+bloodgroup+" not found.");
        }
    }

    public boolean removeDonor(String name)
    {
        for(int i=0;i<donors.size();i++)
        {
            if(donors.get(i).getName().equalsIgnoreCase(name))
            {
                donors.remove(i);
                return true;
            }
        }
        return false;

    }

    public void saveToFile()
    {
        try{
            FileWriter writer=new FileWriter("donor.txt");
        for(Donor d : donors)
        {
            writer.write(d.getName()+","+d.getBloodGroup()+","+d.getAge()+","+d.isAvailable()+"\n");
            
        }
        writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error is saving Donors File!!");
        }
    }
}

