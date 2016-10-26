
public class Dealer {
	
	public static void dealCard(Player p1){
		
		
		
		p1.addToHand(Card.randomCard());
		
		
	
			
	}
	
	public static Card generateCard(){
		
		Card c1 = new Card();
		
		c1.setCard(Card.randomCard());
		c1.setValue(Card.assignValue(c1.getCard()));
		
		return c1;
	}
	
	public static int calcScore(Player p1){
		
		int score = 0;
		
		for (int i = 0; i < p1.hand.length ; i ++){
			
			if (p1.hand[i] == null){
				
				score = score + 0;
			}
			
			else{
			
			score = score + Card.assignValue(p1.hand[i]);
			
			}
			
		}
	
		return score;
	}
	
	
	

}
