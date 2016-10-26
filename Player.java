
public class Player {
	
	public String[] hand;
	private int count;
	private String name;

	
	
	public Player(){
		
		name = "NoName";
		hand = new String[10];		
		count = 0;
	}
	
	public Player(String name){
		
		setName(name);
		count = 0;
		hand = new String[10];
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public int getCount(){
		
		return count;
	}
	
	
	public void addToHand(String card){
		
		
		
		hand[count] = card;
		count++;
		
		//System.out.println(this.count);
	}
	
	
	
	
	

	
	public void printHand(){
		
		
	
		
	
		
		for (int i = 0; i < hand.length; i++){
			
			if (hand[i] == null){
				
				System.out.print("");
			}
			
			else{
				
				System.out.print(hand[i] + ", ");
			}
			
		}
		
	}

	

}
