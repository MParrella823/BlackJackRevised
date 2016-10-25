
public class Card {
	
	private int value;
	private String card;
	public int count = 0;
	
	private String[] Suit = {"void", "H", "S", "C", "D"};
	private String[] Cards = { "void", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	private String[] usedCards = new String[25];
	
	
	public Card(){
		
		value = 0;
		card = null;
	}
	
	public void setCard(String card){
		
		this.card = card;
	}
	
	public String getCard(){
		
		return card;
	}
	
	
	
	public String randomCard(){
		
		String card = null;
		
		int i = (int)(4 * Math.random()) + 1;
		int i2 = (int)(13 * Math.random()) + 1;
			
		card =  Cards[i2] + "" + Suit[i];
		
		
		if (isDrawn(card) == true){
			
			randomCard();
			
		}
		
		else {
			
			usedCards[count] = card;
			count++;
		
		
		
		this.card = card;
		
		}
		
		return card;
		
	}
	
	public void print(){
		
		System.out.print("Used Cards:");
		for (int i = 0; i < usedCards.length; i ++){
			
			
			System.out.print(usedCards[i] + ", ");
			
			
		}
		
		
	}
	
	public boolean isDrawn(String card){
		
		boolean flag = false;
		
		for (int i = 0; i < usedCards.length; i++){
			
			if (usedCards[i] == null){
				
				flag = false;
				
			}
			
			else if (usedCards[i].equals(card)){
				
				flag = true;
				break;
			}
			
			
		}
		
		return flag;	
	}


}
