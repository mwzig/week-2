import java.util.Random;

public class GeneCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.out.println("getTick() returns " + getTick());
	}
	
	public static String getTick() {
		
		Random rand = new Random();
        String[] tickStat = {"hunger", "boredom", "needToPotty", "tiredness"};
        int randomNbr = rand.nextInt(tickStat.length -1 );
        System.out.println("randomNbr is " + randomNbr);
        return tickStat[randomNbr];
    }
    
}
