package University;

public class Accounts {
    private double Tution;
    private  String Status;
    Campuser Accountscampuser;

    public Accounts(double tution, String status, Campuser accountscampuser) {
        Tution = tution;
        Status = status;
        Accountscampuser = accountscampuser;
    }

    public double getTution() {
        return Tution;
    }

    public String getStatus() {
        return Status;
    }

    public Campuser getAccountscampuser() {
        return Accountscampuser;
    }
    public void display(){
        System.out.println("The name of the campuser is "+" "+ Accountscampuser.getName());
        System.out.println("The course of the campuser is "+Accountscampuser.getCourse());
        System.out.println("The regno of the campuser is "+Accountscampuser.getRegNo());
        System.out.println("the Campuser's tution is "+Tution);
        System.out.println("The Campuser's status is "+Status);
        System.out.println("\n");
    }
}
