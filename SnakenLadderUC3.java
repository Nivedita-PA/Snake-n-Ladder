public class SnakenLadderUC3 {

	public static void main(String[] args) {
		//variables
		//int start_Position = 0;
		//double dice_Roll = (int) Math.floor(Math.random() * 10) % 6;
		//double snake_Ladder = Math.floor(Math.random() * 10) % 3;
		int ladder = 0;
		int snake = 0;
		int ladder_1 = 1, ladder_2 = 4, ladder_3 = 9, ladder_4 = 21, ladder_5 = 28, ladder_6 = 51, ladder_7 = 72,
				ladder_8 = 80;
		
		int snake_1 = 17, snake_2 = 53, snake_3 = 62, snake_4 = 64, snake_5 = 87, snake_6 = 95, snake_7 = 98;
		
		for(int start_Position = 0; start_Position < 100; start_Position++) {
			
			double dice_Roll = (int) Math.floor(Math.random() * 10) % 6;
			     start_Position = (int) dice_Roll + start_Position;
			       
		if (dice_Roll == 0) {
			System.out.println("No Play: " +start_Position);
		}
		else if(start_Position == ladder_1 || start_Position == ladder_2 || start_Position == ladder_3 
				|| start_Position == ladder_4 || start_Position == ladder_5 || start_Position == ladder_6
				|| start_Position == ladder_7 || start_Position == ladder_8) { 
	     		ladder = (int) dice_Roll + start_Position;
			System.out.println("Ladder :" +ladder);
		}
	    else if(start_Position == snake_1 || start_Position == snake_2 || start_Position == snake_3 ||
	    		start_Position == snake_4 || start_Position == snake_5 || start_Position == snake_6 
	    		|| start_Position == snake_7) {
			snake = (int) dice_Roll - start_Position;
			System.out.println("Snake: " +start_Position);
		}
		else {
			start_Position = start_Position + 1;
			System.out.println("Chance: " +start_Position);
		}
			
	}

}
