public class HumanResource {
    String Cadre;
    String Name;
    Dreams HumanResourceDream;

    public HumanResource(String cadre, String name, Dreams humanResourceDream) {
        Cadre = cadre;
        Name = name;
        HumanResourceDream = humanResourceDream;
    }

    public String getCadre() {
        return Cadre;
    }

    public String getName() {
        return Name;
    }

    public Dreams getHumanResourceDream() {
        return HumanResourceDream;
    }
     public  void  Display(){
         System.out.println("The Employee Type is "+" "+HumanResourceDream.getType());
         System.out.println("The Employee Department is "+" "+ HumanResourceDream.getDepartment());
         System.out.println("The Employee WorkStation is "+" "+HumanResourceDream.getWorkStation());
         System.out.println("The Employee Cadre is "+" "+getCadre());
         System.out.println("The Employe name is "+" "+getName());
         System.out.println("\n");

     }
}
