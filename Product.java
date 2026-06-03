public class Product {
    
    String name;
    int price;
    String description;

    public void printDetails() {

        System.out.println("Product Details");
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Description: " +description);
    }
}
