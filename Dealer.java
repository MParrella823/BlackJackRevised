import java.util.Scanner;


public class Dealer {
	
	public static void playGame(){
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the name of Player 1: ");
		String userName1 = kb.nextLine();
		Player p1 = new Player();
		p1.setName(userName1);
		
		
		System.out.println("Please enter the name of Player 2: ");
		String userName2 = kb.nextLine();
		Player p2 = new Player();
		p2.setName(userName2);
		
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
		
		Dealer.prompt(p1, p2);
		
		Dealer.whoWon(p1, p2);
		
		
		
	}

	public static void dealCard(Player p1){
		p1.addToHand(Card.addToDeck());
	}

	public static int calcScore(Player p1){
		int score = 0;
		System.out.print("\nCurrent hand value: ");
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

	public static void prompt(Player p1, Player p2){

		boolean flag1 = false;
		boolean flag2 = false;

		do{

			Scanner kb = new Scanner(System.in);
			System.out.println("\n" + p1.getName() + " would you like another card? (1 for yes, 2 for no)");
			int userChoice1 = kb.nextInt();

			if (userChoice1 == 1){

				Dealer.dealCard(p1);
				System.out.print("Current hand: ");
				p1.printHand();
				p1.setScore(Dealer.calcScore(p1));	
				System.out.print(p1.getScore());

				if (p1.getScore() > 21){

					System.out.println("\n" + p1.getName() + " has lost: score exceeded 21!");
					System.exit(0);
				}

				flag1 = true;
			}

			else if (userChoice1 == 2) {
				p1.setScore(Dealer.calcScore(p1));
				flag1 = false;

			}


			System.out.println("\n" + p2.getName() + " would you like another card? (1 for yes, 2 for no)");
			int userChoice2 = kb.nextInt();

			if (userChoice2 == 1){

				Dealer.dealCard(p2);
				System.out.print("Current hand: ");
				p2.printHand();
				p2.setScore(Dealer.calcScore(p2));
				System.out.print(p2.getScore());

				if (p2.getScore() > 21){

					System.out.println("\n" + p2.getName() + " has LOST: score exceeded 21!");
					System.exit(0);
				}
				flag2 = true;
			}
			else if (userChoice2 == 2) {
				p2.setScore(Dealer.calcScore(p2));
				flag2 = false;
			}

		}

		while (flag1 == true || flag2 == true);
		
	

	}

	public static void whoWon(Player p1, Player p2){

		System.out.println("\n" + p1.getName() + "'s final score: " + p1.getScore());
		System.out.println("\n" + p2.getName() + "'s final score: " + p2.getScore());


		if (p1.getScore() > p2.getScore()){

			System.out.println("\n" + p1.getName() + " WINS!!!");
		}

		else if (p2.getScore() > p1.getScore()){

			System.out.println("\n" + p2.getName() + " WINS!!!");

		}

		else if (p1.getScore() == p2.getScore()){

			System.out.println("TIE GAME!!");
		}



	}





}











