import java.util.Scanner;

public class Player {
	public Requests requests;
    public Player()
    {
    	requests = new Requests();
    }
	public void bookPlayground(){
    	Booking book = new Booking();
    
    	book.displayPlayground();
    	
    	Scanner in = new Scanner(System.in);
    	
    	int choice = in.nextInt();
    	
    	in.nextLine();
    	
    	System.out.print("From: ");
    	
    	String from = in.nextLine();
    	
    	System.out.print("To: ");
    	
    	String to = in.nextLine();
    	
    	book.book(this, system.getPlaygrounds()[choice - 1], from, to);
    }
}
