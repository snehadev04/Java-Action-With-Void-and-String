// Computer class with a method to play music
class Computer {
    public void music() {
        System.out.println("Playing music...!!");
    }
}

// BuyPen class with a method to buy a pen based on its cost
class BuyPen {
    public String pen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

// Main class to demonstrate the usage of Computer and BuyPen classes
public class vo {
    public static void main(String[] args) {
        // Create an instance of the Computer class
        Computer mu = new Computer();
        
        // Call the music method of the Computer class to play music
        mu.music();
        
        // Create an instance of the BuyPen class
        BuyPen buy = new BuyPen();
        
        // Call the pen method of the BuyPen class to buy a pen
        String st = buy.pen(3);
        
        // Print the result of buying a pen
        System.out.println(st);
    }
}
