import java.util.*;


public class week4qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(678, "MONISH", 777777,2));
        productList.add(new Product(6738, "MaNISH", 444,3));
        productList.add(new Product(6728, "MuNISH", 4433,5));

        System.out.println("\n=== All Products in ArrayList ===");
        for (Product p : productList) {
           
            double totalPrice = p.price * p.qTy;
            if (totalPrice >= 5000) {
                double discount = totalPrice * 0.10;
                double finalPrice = totalPrice - discount;
                System.out.println("ID: " + p.id + " | Name: " + p.name + " | Total Price: " + totalPrice + " | Discount: " + discount + " | Final Price: " + finalPrice);
            } else {
                double discount = totalPrice * 0.05;
                double finalPrice = totalPrice - discount;
                System.out.println("ID: " + p.id + " | Name: " + p.name + " | Total Price: " + totalPrice + " | Discount: " + discount + " | Final Price: " + finalPrice);
            }
        }

    }
}


class Product {
     int id;
     String name;
     double price;
     int qTy;


    public Product(int id, String name, double price,int qTy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qTy = qTy;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Price: " + price + " | Quantity: " + qTy);
    }
}