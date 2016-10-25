
public class BlackJackDealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Card c1 = new Card();
		c1.randomCard();
		
		System.out.println(c1.getCard());
		
		c1.randomCard();
		
		System.out.println(c1.getCard());
		

		c1.randomCard();
		
		System.out.println(c1.getCard());

		c1.randomCard();
		
		System.out.println(c1.getCard());
		
		c1.print();
	}

}
