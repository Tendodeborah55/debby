public class Beauty {
    static String Brand;
    static String Location;
    static {
        Location="Times new Square 8th street USA";
        Brand="Fenty Beauty";
        System.out.println("The Beauty brand is "+Brand);
        System.out.println("The Beauty location is "+Location);
        System.out.println("\n");
    }
    String Type;
    String Form;

    public Beauty(String type, String form) {
        Type = type;
        Form = form;


        System.out.println("The Beauty brand is "+getBrand());
        System.out.println("The Beauty location is "+getLocation());
        System.out.println("The Beauty Type is "+getType());
        System.out.println("The Beauty Form are "+getForm());
        System.out.println("\n");
    }

    public static String getBrand() {
        return Brand;
    }

    public static String getLocation() {
        return Location;
    }

    public String getType() {
        return Type;
    }

    public String getForm() {
        return Form;
    }

}
