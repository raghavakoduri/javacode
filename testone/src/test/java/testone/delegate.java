package testone;

class RealPrinter { 
    // the "delegate" 
    void print() 
    { 
        System.out.println("The Delegate"); 
    } 

    void printf() 
    { 
        System.out.println("The Delegates"); 
    } 
} 
  
class Printer { 
    // the "delegator" 
    RealPrinter p = new RealPrinter(); 
  
    // create the delegate 
    void print() 
    { 
        p.print(); // delegation 
        p.printf();
    }
    
} 
  
public class delegate { 
  
    // To the outside world it looks like Printer actually prints. 
public static void main(String[] args) 
    { 
        Printer printer = new Printer(); 
        printer.print(); 
    } 
} 