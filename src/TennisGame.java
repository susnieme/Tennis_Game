
public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private int scoreFlag = 0;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		if (hasWinner()) {
			return playerWithHighestScore() + " wins";
		}
		
		if (hasAdvantage()) { 
			return "Advantage " + playerWithHighestScore(); 
		}
		
		if (isDeuce())
			return "Deuce";
		
		if(p1 == p2) {
			return translateScore(p1) + " all";
		}
		
		return translateScore(p1) + " - " + translateScore(p2);
	}
	private boolean isDeuce() {
		return p1 >= 3 && p2 == p1;
	}
	
	private String playerWithHighestScore() {
		if (p1 > p2) {
			return "player1";
		} else {
			return "player2";
		}
	}
	
	private boolean hasWinner() {
		if(p2 >= 4 && p2 >= p1 + 2 )
			return true;
		if(p1 >= 4 && p1 >= p2 + 2)
			return true;
		return false;
	}
	
	private boolean hasAdvantage() {
		if (p2 >= 4 && p2 == p1 + 1)
			return true;
		if (p1 >= 4 && p1 == p2 + 1)
			return true;
		
		return false;

	}

	public void p1s() {
		p1++;
	}

	public void p2s() {
		p2++;
	}
	
	private String translateScore(int score) {
		switch (score) {
		case 3:
			return "Forty";
		case 2:
			return "Thirty";
		case 1: 
			return "Fifteen";
		case 0:
			return "Love";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
}
