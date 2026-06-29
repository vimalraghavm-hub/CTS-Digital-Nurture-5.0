public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Watch", "Accessories")

        };

        System.out.println("Linear Search");

        Product p1 = Search.linearSearch(products, 103);

        if (p1 != null)
            p1.display();

        System.out.println();

        System.out.println("Binary Search");

        Product p2 = Search.binarySearch(products, 103);

        if (p2 != null)
            p2.display();

    }

}