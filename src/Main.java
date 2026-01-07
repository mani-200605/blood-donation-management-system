import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //The below comments are to check the basic objects declaration:
        // Donor d1=new Donor("Mani","o+",19,true);
        // System.out.println("Donor Name: " + d1.getname());
        // System.out.println("Blood Group:"+d1.getbg());
        // System.out.println("Age:"+d1.getage());
        // System.out.println("Availability:"+d1.isAvailable());

        DonorManager manager=new DonorManager();

        Donor d1=new Donor("Ravi","O+",19,true);
        Donor d2=new Donor("Kavi","A+",19,false);
        manager.addDonor(d1);
        manager.addDonor(d2);

        // manager.showAllDonors();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Blood Group to serach:");
        String bg=sc.nextLine();
        manager.searchByBloodGroup(bg);
     }
}