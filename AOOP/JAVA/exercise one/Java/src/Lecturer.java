public class Lecturer {
    String Fname;
    String Lname;
    String Faculty;
    String FacultyId;

    public void calculatesalary(double taxes){
        double Netsalary=4000000-taxes;
        System.out.println("The lecturer's salary is "+Netsalary);
    }
    public void DisplayInfo(){
        System.out.println("The Lectures first name is "+Fname);
        System.out.println("The Lectures Last name is "+Lname);
        System.out.println("The Lectures Faculty is "+Faculty);
        System.out.println("The Lectures FacultyId is "+FacultyId);
    }
    public static void main(String[]args){
        Lecturer HOD = new Lecturer();
        HOD.Fname= "Mukalazi";
        HOD.Lname="Sadat";
        HOD.Faculty="Science and Technology";
        HOD.FacultyId="FST/0156";


        HOD.DisplayInfo();
        HOD.calculatesalary(235000);

    }

}
