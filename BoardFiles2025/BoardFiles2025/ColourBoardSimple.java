import java.util.*;

public class ColourBoardSimple{

	static int colourPicker = 0;		//static variables set for universal use by BoardSimple class
	static int dim = userSize();	        //call to userSize method is stored as a static variable
	//static Board board = new Board(dim, dim);//and immediately used to build a Board object of user-defined size. 

	static Board board = new ColourBoard(dim,dim);  //Builds a board using new colours.

	//method to determine if user action is legal given rules of game
	public static boolean isLegal(Coordinate n){
	
		return true;	//to be re-programmed at a later time

	}
	
	//this method uses terminal to ask the user what size the board should be

	public static int userSize(){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("What size should the board be?");
		int dim = scan.nextInt();
		return dim;
	
	}
	
	public static void main(String[] args){
	
		boolean won = false;		//variable to determine if game is over
		
		board.putPeg("black",0,0);		//initial board setup, four pegs in four corners
		board.putPeg("black", 0, dim-1);
		board.putPeg("white",dim-1,0);
		board.putPeg("white", dim-1, dim-1);
		
		while(!won){
		
			Coordinate currentClick = board.getClick();//get the coordinate where the user clicked (the mouse) on the board
			
			if(isLegal(currentClick)){//as long as its a legal move, the program puts pegs of alternating colour on the coordinate chosen by the user
			
				board.removePeg(currentClick.getRow(), currentClick.getCol());
				
				if(colourPicker%2==0){
				
					board.putPeg("white", currentClick.getRow(), currentClick.getCol());

				}
				else{
				
					board.putPeg("black", currentClick.getRow(), currentClick.getCol());

				}
				
				colourPicker++;
			}
			else{//if its not a legal move, inform user it is not a legal move
			
				board.displayMessage("Invalid Move");
				
			}
			
		}
		
		board.displayMessage("Game Over");//game over script, currently unreachable
			
	
	}
	
}
