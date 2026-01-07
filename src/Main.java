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
        
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true)
        {
            System.out.println("Donor Management System:\n1.Add Donor\n2.Show All Donors\n3.Search By Blood Group\n4.Exit\nEnter Your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the name:");
                    String name=sc.nextLine();
                    System.out.println("Enter Age:");
                    int age=sc.nextInt();
                    sc.nextLine();
                    if(age<18)
                    {
                        System.out.println("Under Age!!");
                        break;
                    }
                    System.out.println("Enter Blood Group:");
                    String bloodgroup=sc.nextLine();
                    System.out.println("Available?:");
                    String availability=sc.nextLine();
                    boolean available;
                    if(availability.equalsIgnoreCase("yes"))
                    {
                        available=true;
                    }
                    else{
                        available=false;
                    }

                    Donor newDonor=new Donor(name,bloodgroup,age,available);
                    manager.addDonor(newDonor);
                    System.out.println("Donor added successfully!");
    

                    break;

                case 2:
                    manager.showAllDonors();
                    break;
                case 3:
                    System.out.println("Enter the Blood Group:");
                    String bg=sc.nextLine();
                    manager.searchByBloodGroup(bg);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!!");

            }
        }

     }
}