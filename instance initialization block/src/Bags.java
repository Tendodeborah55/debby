public class Bags {

    String Brand="Heremes";
    String Color="black";
    String Edition="5th Edition";
    int BagNumber=20;
    {
        System.out.println("The first Bag Brand is: " + Brand);
        System.out.println("The first Bag color is: " + Color);
        System.out.println("The first Bag edition is: " + Edition);
        System.out.println("The first Bag number is: " + BagNumber);
        System.out.println("\n");
    }

    public Bags(String brand, String color, String edition, int bagNumber) {
        Brand = brand;
        Color = color;
        Edition = edition;
        BagNumber = bagNumber;

        System.out.println("The Bag Brand is: " + getBrand());
        System.out.println("The Bag color is: " + getColor());
        System.out.println("The Bag edition is: " + getEdition());
        System.out.println("The Bag number is: " + getBagNumber());
        System.out.println("\n");

    }

    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return Color;
    }

    public String getEdition() {
        return Edition;
    }

    public int getBagNumber() {
        return BagNumber;
    }



}
