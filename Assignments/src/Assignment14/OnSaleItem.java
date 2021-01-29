package Assignment14;


public class OnSaleItem extends Item {
   
    private double discount;
    
    
    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
        super(name, quantity, catalogNumber, price - (price * discount / 100));
        this.discount = discount;
    }
    
    
    public double getDiscount() {
        return this.discount;
    }
    
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
   
    @Override
    public String toString() {
        return "OnSaleItem{" +
                       "discount=" + discount + "%" +
                       ", name=" + super.getName() +
                       ", price" + super.getPrice() +
                       "}";
    }
}
