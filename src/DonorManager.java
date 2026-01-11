
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
        if(donors.isEmpty())
                    {
                        System.out.println("NO donors available.");
                    }
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

    public void loadFromFile()
    {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("donor.txt"));
            String line;

            while((line=reader.readLine())!=null)
            {
                String[] parts=line.split(",");
                String name=parts[0];
                String bloodgroup=parts[1];
                int age=Integer.parseInt(parts[2]);
                boolean available=Boolean.parseBoolean(parts[3]);

                Donor donor=new Donor(name,bloodgroup,age,available);
                donors.add(donor);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("...");
        }

    }

    public boolean donorExists(String name)
    {
        for(Donor d:donors){
            if(d.getName().equalsIgnoreCase(name))
            {
                return true;
            }
        }
            return false;
    }
}

