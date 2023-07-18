package practice.oop.task5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");

    // Key variables
    private List<AccessibleProduct> collectionOfProducts;
    private int orderNumber = 0;
    private String orderDate;
    
    // Constructor
    public Order(AccessibleProduct...products){
        collectionOfProducts = new ArrayList<>();
        for (AccessibleProduct item : products) {
            this.collectionOfProducts.add(item);
        }
        orderNumber = count.incrementAndGet();
        orderDate = formatter.format(new Date(System.currentTimeMillis()));
    }

    // Getters for key variables
    public int getOrderNumber(){ return orderNumber; }
    public String getOrderDate(){ return orderDate; }
    public List<AccessibleProduct> getCollectionOfProducts(){ return collectionOfProducts; }

    public String getFullOrderInfo(){
        return String.format("Order id: %d%nDate of order: %s%nOrder content: %s%n", getOrderNumber(), getOrderDate(), getCollectionOfProducts().toString());
    }

    // Available functionality in form of methods
    public void addProductToOrder(AccessibleProduct item){
        collectionOfProducts.add(item);
    }

    public void removeProductFromOrder(AccessibleProduct item){
        collectionOfProducts.remove(item);
    }

    public float fullPriceOfOrder(){
        float result = 0f;
        for (AccessibleProduct product : collectionOfProducts){
            result += product.price();
        }
        return (float) (Math.round(result * 100) / 100.0);
    }
}
