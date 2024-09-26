import University.Accounts;
import University.Campuser;

public class Main {
    public static void main(String[] args) {
        Campuser stud1= new Campuser("Makumbi Andrew","BIT/S", "45/nkn/098",6);
        Accounts st1= new Accounts(2000000,"CLEARED" , stud1);
        st1.display();

        Campuser stud2= new Campuser("nankya hellen","BSSE/S", "45/nkn/200",7);
        Accounts st2= new Accounts(2500000,"CLEARED" , stud2);
        st2.display();
    }
}
class subcampuser extends Campuser {
    public subcampuser(String name, String course, String regNo, int courseUnits) {
        super(name, course, regNo, courseUnits);
    }
}