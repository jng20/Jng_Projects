import java.util.Scanner;

public class Board {

		private int turn = 1;												//will help know if game over
		private String[][] Board = {
										{" ", "|", " ", "|", " "},
										{"-", "|", "-", "|", "-"},
										{" ", "|", " ", "|", " "},
										{"-", "|", "-", "|", "-"},
										{" ", "|", " ", "|", " "},
									};





		public void PrintBoard() {
			Clear();
			for(String[] a : Board) {
				for(String foo : a) {
					System.out.print(foo);
				}
				System.out.println();
			}

		}

		public void Clear() {
			for(int i = 0; i<3; i++) {
				System.out.println();
			}
		}

		public boolean PlaceP1(int p) {
			//Clear();
			if( p == 1 && Board[0][0].equals(" ") ) {
				Board[0][0] = "X";
				turn++;
				return true;
			}else if(p == 2 && Board[0][2].equals(" ")) {
				Board[0][2] = "X";
				turn++;
				return true;
			}else if(p == 3 && Board[0][4].equals(" ")) {
				Board[0][4] = "X";
				turn++;
				return true;
			}else if(p == 4 && Board[2][0].equals(" ")) {
				Board[2][0] = "X";
				turn++;
				return true;
			}else if(p == 5 && Board[2][2].equals(" ")) {
				Board[2][2] = "X";
				turn++;
				return true;
			}else if(p == 6 && Board[2][4].equals(" ")) {
				Board[2][4] = "X";
				turn++;
				return true;
			}else if(p == 7 && Board[4][0].equals(" ")) {
				Board[4][0] = "X";
				turn++;
				return true;
			}else if(p == 8 && Board[4][2].equals(" ")) {
				Board[4][2] = "X";
				turn++;
				return true;
			}else if(p == 9 && Board[4][4].equals(" ")) {
				Board[4][4] = "X";
				turn++;
				return true;
			}else {
				System.out.println("invalid input. Please input integer between 1-9 inclusive.");
				return false;

			}
		}

		public boolean PlaceP2(int p) {
			//Clear();
			if(p == 1 && Board[0][0].equals(" ")) {
				Board[0][0] = "O";
				turn++;
				return true;
			}else if(p == 2 && Board[0][2].equals(" ")) {
				Board[0][2] = "O";
				turn++;
				return true;
			}else if(p == 3 && Board[0][4].equals(" ")) {
				Board[0][4] = "O";
				turn++;
				return true;
			}else if(p == 4 && Board[2][0].equals(" ")) {
				Board[2][0] = "O";
				turn++;
				return true;
			}else if(p == 5 && Board[2][2].equals(" ")) {
				Board[2][2] = "O";
				turn++;
				return true;
			}else if(p == 6 && Board[2][4].equals(" ")) {
				Board[2][4] = "O";
				turn++;
				return true;
			}else if(p == 7 && Board[4][0].equals(" ")) {
				Board[4][0] = "O";
				turn++;
				return true;
			}else if(p == 8 && Board[4][2].equals(" ")) {
				Board[4][2] = "O";
				turn++;
				return true;
			}else if(p == 9 && Board[4][4].equals(" ")) {
				Board[4][4] = "O";
				turn++;
				return true;
			}else {
				System.out.println("invalid input. Please input integer between 1-9 inclusive.");
				return false;
			}
		}

	//check win cases for both Xs and Os. 8 cases
	//Check if Board filled
		// 00,02,04
		// 20,22,24
		// 40,42,44
		public boolean gameOver() {
			if(Board[0][0] == "X" && Board[0][2] == "X" && Board[0][4] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][0] == "O" && Board[0][2] == "O" && Board[0][4] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[2][0] == "O" && Board[2][2] == "O" && Board[2][4] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[4][0] == "O" && Board[4][2] == "O" && Board[4][4] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[0][0] == "O" && Board[2][0] == "O" && Board[4][0] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[0][2] == "O" && Board[2][2] == "O" && Board[4][2] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[0][4] == "O" && Board[2][4] == "O" && Board[4][4] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[0][0] == "O" && Board[2][2] == "O" && Board[4][4] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[0][4] == "O" && Board[2][2] == "O" && Board[4][0] == "O") {
				System.out.println("Player 2 wins!");
				return true;
			}else if(Board[2][0] == "X" && Board[2][2] == "X" && Board[2][4] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[4][0] == "X" && Board[4][2] == "X" && Board[4][4] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][0] == "X" && Board[2][0] == "X" && Board[4][0] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][2] == "X" && Board[2][2] == "X" && Board[4][2] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][4] == "X" && Board[2][4] == "X" && Board[4][4] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][0] == "X" && Board[2][2] == "X" && Board[4][4] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(Board[0][4] == "X" && Board[2][2] == "X" && Board[4][0] == "X") {
				System.out.println("Player 1 wins!");
				return true;
			}else if(turn > 9 ) {
				System.out.println("Draw! Game Over");
				return true;
			}else {
				return false;
			}
		}

		public void reset() {
			turn = 1;
			Board[0][0] = " ";
			Board[0][2] = " ";
			Board[0][4] = " ";
			Board[2][0] = " ";
			Board[2][2] = " ";
			Board[2][4] = " ";
			Board[4][0] = " ";
			Board[4][2] = " ";
			Board[4][4] = " ";
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    boolean play = false;										//Help with placing
		    boolean gameovr = false;
		    boolean end = true;
			Board b = new Board();


			while(gameovr == false) {
				b.PrintBoard();

				System.out.print("Place your X (input number 1-9 inclusive): ");

				while( play == false ) {
					System.out.print("Place your X (input number 1-9 inclusive): ");
					play = b.PlaceP1(sc.nextInt());
				}
				b.PrintBoard();
				play = false;
				if(b.gameOver()) { play = true; } 		//if player 1 wins player 2 can't play;

				while( play == false ) {
					System.out.print("Place your O (input number 1-9 inclusive): ");
					play = b.PlaceP2(sc.nextInt());
				}
				b.PrintBoard();
				play = false;
				gameovr = b.gameOver();

				System.out.println(gameovr);

				if(gameovr) {

					while(end) {
						System.out.print("Play again?(please type Yes or No exactly): ");
						String input = sc.next();
						if( input.equals("Yes") ) {
							b.reset();
							play = false;
							gameovr = false;
							end = false;
						}else if ( input.equals("No") ) {
							System.out.print("Thanks for playing! Please like and subscribe. Don't forget to hit the bell!");
							end = false;
						}else {
							System.out.println("Why can't you follow directions smh");
						}
					}
					end = true;

				}
			}

		}
}
