package Assignment14;

public class Item {
    
    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;
    
   
    public Item(String name, int quantity, int catalogNumber, double price) {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;
        
    }
    
   
    public double getPrice() {
        
        return this.price;
    }
    
   
    public void setPrice(double price) {
        this.price = price;
    }
    
   
    public String getName() {
        
        
        return this.name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getCatalogNumber() {
        return this.catalogNumber;
    }
    
    public void setCatalogNumber(int catalogNumber) {
        this.catalogNumber = catalogNumber;
    }
    
  
    @Override
    public String toString() {
        return "Regular Item{" +
                       "name='" + name + '\'' +
                       ", catalogNumber=" + catalogNumber +
                       ", quantity=" + quantity +
                       ", price=" + price +
                       '}';
    }
}