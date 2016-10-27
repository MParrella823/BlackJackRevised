import java.util.Scanner;


public class BlackJackDealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Player p1 = new Player("Matt");
		Player p2 = new Player("Jimbo");
		
		Dealer.dealCard(p1);
		Dealer.dealCard(p2);
		Dealer.dealCard(p1);
		Dealer.dealCard(p2);
			
		System.out.print(p1.getName() + "'s Initial Hand: ");
		p1.printHand();
		System.out.println("Hand value: " + Dealer.calcScore(p1));
		
		System.out.println("\n");
		
		System.out.print(p2.getName() + "'s Initial Hand: ");
		p2.printHand();
		System.out.println("Hand value: " + Dealer.calcScore(p2));
	

		
		
		
		
	}

}
