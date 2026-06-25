package Module2;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchAlgorithms {

    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return mid;
            }
            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Product[] inventory = {
            new Product(101, "Laptop", "Electronics"),
            new Product(105, "Smartphone", "Electronics"),
            new Product(110, "Desk Chair", "Furniture"),
            new Product(120, "Coffee Mug", "Kitchen")
        };

        int target = 110;

        
        int linearResult = linearSearch(inventory, target);
        System.out.println("Linear Search Result (Index): " + linearResult);

    
        int binaryResult = binarySearch(inventory, target);
        System.out.println("Binary Search Result (Index): " + binaryResult);
    }
}