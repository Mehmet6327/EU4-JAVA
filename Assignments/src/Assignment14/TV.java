package Assignment14;

public class TV {
    /*    Question-5
     */
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private String brand = "undefined";
    
    //constructors
    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
        
    }
    
    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
    
    //get & set
    public int getVolumeLevel() {
        return this.volumeLevel;
    }
    
    public void setVolumeLevel(int volumeLevel) {
        if ((volumeLevel < 1 || volumeLevel > 7) || !on) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            this.volumeLevel = volumeLevel;
        }
    }
    
    public int getChannel() {
        return this.channel;
    }
    
    public void setChannel(int channel) {
        
        if ((channel < 1 || channel > 120) || !on) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            this.channel = channel;
        }
        
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    //methods
    
    public void channelUp() {
        setChannel(++this.channel);
    }
    
    public void channelDown() {
        setChannel(--this.channel);
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public void volumeUp() {
        setVolumeLevel(++this.volumeLevel);
    }
    
    public void volumeDown() {
        setVolumeLevel(--this.volumeLevel);
    }
    
    public void turnOn() {
        if (isOn()) {
            System.out.println("TV is already ON");
        } else {
            this.on = true;
        }
    }
    
    public void turnOff() {
        if (isOn()) {
            this.on = false;
        } else {
            System.out.println("TV is already OFF");
        }
    }
}
