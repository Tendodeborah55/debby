public class StaticLecturer {
   static String Fname;
     static String Lname;
    static  String Faculty;
    static String FacultyId;

    public void DisplayInfo(){
        System.out.println("The Lectures first name is "+Fname);
        System.out.println("The Lectures Last name is "+Lname);
        System.out.println("The Lectures Faculty is "+Faculty);
        System.out.println("The Lectures FacultyId is "+FacultyId);
    }
    public static void main(String[]args) {
        Lecturer HOD = new Lecturer();
        HOD.Fname = "Mukalazi";
        HOD.Lname = "Sadat";
        HOD.Faculty = "Science and Technology";
        HOD.FacultyId = "FST/0156";


        HOD.DisplayInfo();
    }

    }
