import java.util.Scanner;

public class SpielInput{
	public static void main(String[] args){ 
		Scanner scanner = new Scanner(System.in); 
		
		String asteroid = "a";
		String tetris = "t";
		String exit = "x";
		
		while (true){
			
			System.out.println("Bitte ein Game wählen: A (Asteroid), T (Tetris), X (Exit)");
			String input = scanner.nextLine();
			
			if(input.equalsIgnoreCase(exit)){
				System.out.println("Auf Wiedersehen! ");
				break;
			}
			
			else if(input.equalsIgnoreCase(asteroid)){
				System.out.println("Du hast Asteroid gewaehlt ");
			}
			else if(input.equalsIgnoreCase(tetris)){
				System.out.println("Du hast Tetris gewaehlt ");
			}
			else if(!input.equalsIgnoreCase(asteroid) || !input.equalsIgnoreCase(tetris) || !input.equalsIgnoreCase(exit)){
				System.out.println("Ungueltige Eingabe!");
			}
			
		}
		
   
   }
}