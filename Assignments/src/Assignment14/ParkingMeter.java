package Assignment14;

public class ParkingMeter {
    /*    Question-6
     */
    int timeLeft = 0;
    int maxTime;
    
    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }
    
    public boolean add(int time) {
        if (time == 25 && (timeLeft + 30 <= maxTime)) {
            this.timeLeft += 30;
            return true;
        }
        return false;
    }
    
    public void tick() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }
    
    public boolean isExpired() {
        if (timeLeft == 0) {
            return true;
        }
        return false;
    }
}
