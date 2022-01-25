
public class Main {

	public static void main(String[] args) {
		
		int i, j;
		int[][] schachbrett = new int[8][8];
		
		for (i = 0; i < schachbrett.length; i++) {
	
			for (j = 0; j < schachbrett[i].length; j++) {
				
				System.out.print((i + j + 1) + "\t");
				
			}
			System.out.println();
			
		}

	}

}
