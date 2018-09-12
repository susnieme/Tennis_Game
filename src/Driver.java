import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan= new Scanner(System.in);

	    //For string

	    String text= scan.nextLine();

	    System.out.println(text);

	    //for int

	    int num= scan.nextInt();

	    System.out.println(num);
	    
		TennisGame play = new TennisGame();
		if (num == 1) {
			play.p1s();
		}
		if (num == 2) {
			play.p2s();
		}		
		play.getScore();
	}

}
