import java.io.*;
public class Main {
	public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
	Dice test = new Dice(6,2);
	CharSheet test1 = new CharSheet();
	int thing = test.roll();
	System.out.print(thing);
	System.out.print("\n");
    System.out.println("Hello, World");
   }
}