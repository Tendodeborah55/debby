import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Dreams Vol1 = new Dreams("Volunteer", "Field", "Ndejje subcounty");
        HumanResource emp1 = new HumanResource("Peer", "Nakate Aisha", Vol1);
        emp1.Display();

        Dreams Vol2 = new Dreams("Staff", "M&E", "Ndejje subcounty");
        HumanResource emp2 = new HumanResource("Dreams officer", "Mbabazi Jackline", Vol2);
        emp2.Display();

        Dreams Vol3 = new Dreams("Staff", "Field", "Ndejje subcounty");
        HumanResource emp3 = new HumanResource("Data Officer", "Tendo Deborah", Vol3);
        emp3.Display();






    }
}
