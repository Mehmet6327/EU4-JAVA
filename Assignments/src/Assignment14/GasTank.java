package Assignment14;

public class GasTank {
    /**    Question-7

     */
    
    double amount = 0;
    double capacity;
    
    public GasTank(double capacity) {
        this.capacity = capacity;
    }
    
    public void addGas(double amount) {
        if (this.amount + amount > capacity) {
            this.amount = capacity;
        } else {
            this.amount = amount;
        }
    }
    
    public void useGas(double amount) {
        if (this.amount - amount > 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }
    
    public boolean isEmpty() {
        return this.amount < 0.1;
    }
    
    public boolean isFull() {
        return this.amount > this.capacity - 0.1;
    }
    public double getGasLevel(){
        return this.amount;
    }
    public double fillUp(){
        double fillAmount = capacity - amount;
        this.amount = this.capacity;
        return fillAmount;
    }
}
