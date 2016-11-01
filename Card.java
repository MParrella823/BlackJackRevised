import java.util.Scanner;


public class Card {

	private static String card;
	public static int count = 0;

	private static final String[] Suit = {"void", "H", "S", "C", "D"};
	private static final String[] Cards = { "void", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public static String[] usedCards = new String[52];

	
	public static String randomCard(){

		String card = null;
		int i = (int)(4 * Math.random()) + 1;
		int i2 = (int)(13 * Math.random()) + 1;
		card =  Cards[i2]  + "(" + Suit[i] + ")";

		return card;
	}

	public static void print(){
		System.out.print("Used Cards:");
		for (int i = 0; i < usedCards.length; i ++){
			System.out.print(usedCards[i] + ", ");
		}
	}

	public static boolean isDrawn(String card){

		boolean flag = false;
		for (int i = 0; i < usedCards.length; i++){
			if (usedCards[i] == null){
				flag = false;
				break;
			}
			else if (usedCards[i].equals(card)){
				flag = true;
				break;
			}
			else {
				flag = false;
			}
		}
		return flag;	
	}

	public static String addToDeck(){
		boolean flag = true;
		while(flag == true){
			card = randomCard();
			if (isDrawn(card)==false){
				usedCards[count] = card;
				count++;
				flag = false;
			}
		}
		
		return card;
	}

	public static int assignValue(String card){

		int val = 0;
		char c = 0;

		if (card.length() == 5){		
			val = 10;			
		}
		else{
			c = card.charAt(0);
			if (Character.isDigit(c) == true){
				val = Character.getNumericValue(c);
			}
			else if (c == 'A'){
				Scanner kb = new Scanner(System.in);
				System.out.println("Please choose the value for Ace (1 or 11): ");
				String userChoice = kb.nextLine();
				if (userChoice.equals("1")){
					val = 1;
				}
				
				else if (userChoice.equals("11")){
				val = 11;
				}
				
				else {
					System.out.println("Error: Please enter either 1 or 11.");
					System.exit(0);
				}
				
			}
			else if (Character.isLetter(c) == true){
				val = 10;
			}
		}
		return val;
	}


}
