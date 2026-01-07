public class Main{
    public static void main(String[] args) {
        Donor d1=new Donor("Mani","o+",19,true);
        System.out.println("Donor Name: " + d1.getname());
        System.out.println("Blood Group:"+d1.getbg());
        System.out.println("Age:"+d1.getage());
        System.out.println("Availability:"+d1.isAvailable());
    }
}