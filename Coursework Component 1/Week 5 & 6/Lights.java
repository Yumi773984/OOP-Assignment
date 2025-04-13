package Java_Coursework;

class Bulb {
    private boolean isOn;  // true if bulb is on
    
    // Create a new bulb (starts off)
    public Bulb() {
        isOn = false;
    }
    
    // Turn the bulb on
    public void turnOn() {
        isOn = true;
    }
    
    // Turn the bulb off
    public void turnOff() {
        isOn = false;
    }
    
    // Check if bulb is on
    public boolean isOn() {
        return isOn;
    }
    
    // Show bulb status as text
    public String toString() {
        if (isOn) {
            return "On";
        } else {
            return "Off";
        }
    }
}

public class Lights {
    public static void main(String[] args) {
        // Make some bulbs
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();
        
        // Turn some on
        bulb1.turnOn();
        bulb3.turnOn();
        
        // Show status
        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);
        System.out.println("Bulb 3: " + bulb3);
        
        // Turn one off and show again
        bulb3.turnOff();
        System.out.println("\nAfter turning off bulb 3:");
        System.out.println("Bulb 3 is now: " + bulb3);
    }
}