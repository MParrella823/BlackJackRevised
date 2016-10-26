import java.util.Scanner;


public class BlackJackDealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Player p1 = new Player("Matt");
	
		
		Dealer.dealCard(p1);
		Dealer.dealCard(p1);
		
		Player p2 = new Player("Kayt");
		
		Dealer.dealCard(p2);
		Dealer.dealCard(p2);
		
		p1.printHand();
		System.out.println("Hand Value: " + Dealer.calcScore(p1));
		p2.printHand();
		System.out.println("Hand Value: " + Dealer.calcScore(p2));
		
	    System.out.println("\n");
		Card.print();
		
		
		
		
		
	}

}
