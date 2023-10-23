package Kiosk;

public class Menu {
    private String name;
    private String price;
    private String description;

    public Menu(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {return name;}
    public String getPrice() {return price;}
    public String getDescription() {return description;}

}
