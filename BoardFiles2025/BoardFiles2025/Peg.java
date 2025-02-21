import java.util.*;//import java utilities

public class Peg{//initialize new class named Peg

/*------------------initializing basic game data-----------------------------*/

    static Scanner scan = new Scanner(System.in);//initialize a new scanner
    static int size = type();//initialize a new integer "size" and call the type method to get the value
    static Board board = new Board(Math.abs(size), Math.abs(size));//initialize a new board with the given size
    static String[][] pegs = new String[Math.abs(size)][Math.abs(size)];//initialize a new 2d array with the given size

/*------------------next section is all the helper methods------------------------------*/

    //this method prints out introductions and return the board size
    public static int type(){

      for(int i=0; i<20; i++){//introductions
        System.out.println(" ");
      }
      System.out.println("Welcome to the Peg Solitaire Game.");
      System.out.println("Please check the user manual for instructions.");

      boolean fool = true;//initialize a boolean for foolproof
      int type = 0;//the initeger this method going to return

      while(fool){//if user didn't give valid input, keep runing
        System.out.println("  ");
        System.out.println("What style would you like to play? (Input Only Integers Listed!)");//giving user different choices
        System.out.println("  ");
        System.out.println("--Classic--");
        System.out.println("1. English Style (Cross Shape)");
        System.out.println("2. French Style (Octagon Shape)");
        System.out.println("3. Enhanced English Style");
        System.out.println("4. Enhanced French Style");
        System.out.println("  ");
        System.out.println("--Modern--");
        System.out.println("5. Diamond Style");
        System.out.println("6. Asymmetrical 3-3-2-2 Style (Shifted Cross)");
        System.out.println("7. French vs Britain Style (Special Rules)");
        System.out.println("8. Special Triangle (Extremely Difficult)");
        System.out.println("9. Small Square");
        System.out.println("10. Huuuge Square");
        System.out.println("  ");
        String ans = scan.nextLine();//store user's input as a string

        //next section return the different board sizes as integer "type" depends on different choices made by user
        if (ans.equals("1")){
            type = 9;
            fool=false;
          }
        else if (ans.equals("2")){
            type = -9;
            fool=false;
          }
        else if (ans.equals("3")){
            type = 11;
            fool=false;
          }
        else if (ans.equals("4")){
            type = -11;
            fool=false;
          }
        else if (ans.equals("5")){
            type = 10;
            fool=false;
          }
        else if (ans.equals("6")){
            type = -10;
            fool=false;
          }
        else if (ans.equals("7")){
            type = 7;
            fool=false;
          }
        else if (ans.equals("8")){
            type = -7;
            fool=false;
          }
        else if (ans.equals("9")){
            type = 8;
            fool=false;
          }
        else if (ans.equals("10")){
            type = 12;
            fool=false;
          }
        else if (ans.equals("GERMAN")){
            type = -12;
            fool=false;
        }
        else if (ans.equals("It's Zach")){
            type = 5;
            fool=false;
        }
        else{//if user gave invalid input, repeat the foolproof loop
            for(int i=0; i<30; i++){
              System.out.println(" ");
            }
            System.out.println("Just INPUT The Integers That Are Listed!!!");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
          }

      }
  		return type;

  	}

    //this method receive two coordinates as "initial," "moved" to check if the move is legal
    public static boolean isLegal(Coordinate initial, Coordinate moved){
      //initialize two integers to store the row and col differences
      int rowD = moved.getRow() - initial.getRow();
      int colD = moved.getCol() - initial.getCol();

      //if the "moved" coordinate is not empty and within the legal area, return false
      if(!pegs[moved.getRow()][moved.getCol()].equals("n")){
        return false;
      }
      //if the "moved" coordinate is one peg away from the initial and there is a peg between them, return true
      //there are eight possible directions the legal move can be. (top, down, left, right and four diagonals)
      else if(rowD == 0 && colD == -2 && pegs[initial.getRow()][initial.getCol()-1].equals("has")){
        return true;
      }
      else if(rowD == 0 && colD == 2 && pegs[initial.getRow()][initial.getCol()+1].equals("has")){
        return true;
      }
      else if(rowD == 2 && colD == 0 && pegs[initial.getRow()+1][initial.getCol()].equals("has")){
        return true;
      }
      else if(rowD == -2 && colD == 0 && pegs[initial.getRow()-1][initial.getCol()].equals("has")){
        return true;
      }
      else if(rowD == 2 && colD == 2 && pegs[initial.getRow()+1][initial.getCol()+1].equals("has")){
        return true;
      }
      else if(rowD == -2 && colD == -2 && pegs[initial.getRow()-1][initial.getCol()-1].equals("has")){
        return true;
      }
      else if(rowD == 2 && colD == -2 && pegs[initial.getRow()+1][initial.getCol()-1].equals("has")){
        return true;
      }
      else if(rowD == -2 && colD == 2 && pegs[initial.getRow()-1][initial.getCol()+1].equals("has")){
        return true;
      }
      //all the other move are illegal, return false
      return false;

    }

    //this method receive one coordinate and check if this one has possible moves by calling isLegal method
    public static boolean moreMoves(Coordinate initial){
      //initialize 8 coordinates that are eight possible moving directions
      Coordinate check = new Coordinate(initial.getRow(),initial.getCol()-2);
      Coordinate check2 = new Coordinate(initial.getRow(),initial.getCol()+2);
      Coordinate check3 = new Coordinate(initial.getRow()+2,initial.getCol());
      Coordinate check4 = new Coordinate(initial.getRow()-2,initial.getCol());
      Coordinate check5 = new Coordinate(initial.getRow()+2,initial.getCol()+2);
      Coordinate check6 = new Coordinate(initial.getRow()-2,initial.getCol()-2);
      Coordinate check7 = new Coordinate(initial.getRow()+2,initial.getCol()-2);
      Coordinate check8 = new Coordinate(initial.getRow()-2,initial.getCol()+2);

      //next four "if" statements are avoiding array out of boundaries error for four specific poitns
      //only first one is commented since they are the same structure
      if(initial.getRow()==1 && initial.getCol()==1){//if the initial coordinate is at left-up corner
        //don't check the out of boundaries coordinates
        if(isLegal(initial,check2)||isLegal(initial,check3)||isLegal(initial,check5)){//call isLegal methods with possible coordinates
          return true;//return true if at least one direction has possible move
        }
      }
      else if(initial.getRow()==1 && initial.getCol()==Math.abs(size)-2){
        if(isLegal(initial,check)||isLegal(initial,check3)||isLegal(initial,check7)){
          return true;
        }
      }
      else if(initial.getRow()==Math.abs(size)-2 && initial.getCol()==1){
        if(isLegal(initial,check2)||isLegal(initial,check4)||isLegal(initial,check8)){
          return true;
        }
      }
      else if(initial.getRow()==Math.abs(size)-2 && initial.getCol()==Math.abs(size)-2){
        if(isLegal(initial,check)||isLegal(initial,check4)||isLegal(initial,check6)){
          return true;
        }
      }
      else{
        //next four "if" statements also avoiding array out of boundaries for two rows and two cols
        //same struture: don't check out of boundaries coords, return true if there is at least one possible move
        if(initial.getRow()==1){
          if(isLegal(initial,check)||isLegal(initial,check2)||isLegal(initial,check3)||isLegal(initial,check5)||isLegal(initial,check7)){
            return true;
          }
        }
        else if(initial.getCol()==1){
          if(isLegal(initial,check2)||isLegal(initial,check3)||isLegal(initial,check4)||isLegal(initial,check5)||isLegal(initial,check8)){
            return true;
          }
        }
        else if(initial.getRow()==Math.abs(size)-2){
          if(isLegal(initial,check)||isLegal(initial,check2)||isLegal(initial,check4)||isLegal(initial,check6)||isLegal(initial,check8)){
            return true;
          }
        }
        else if(initial.getCol()==Math.abs(size)-2){
          if(isLegal(initial,check)||isLegal(initial,check3)||isLegal(initial,check4)||isLegal(initial,check6)||isLegal(initial,check7)){
            return true;
          }
        }
        else{//if there is no out of boundaries error, check all 8 directions and return true if there is at one possible move
          if(isLegal(initial,check)||isLegal(initial,check2)||isLegal(initial,check3)||isLegal(initial,check4)||isLegal(initial,check5)||isLegal(initial,check6)||isLegal(initial,check7)||isLegal(initial,check8)){
            return true;
          }
        }
      }
      return false;//if there is no possible moves in any directions, return false
    }

    //this method receive the given coordinate to start the game by removing the this peg as starting point
    public static void start(Coordinate n){
      board.removePeg(n.getRow(), n.getCol());
      pegs[n.getRow()][n.getCol()]="n";//store "n" to this peg's coordinate in 2d array for future references
    }

    //this method receive the given coordinate to change the selected peg's colour to cyan to notice user
    public static void current(Coordinate n){
      board.putPeg("cyan", n.getRow(), n.getCol());
    }

    //this method receive two given coordinates to perform the move step
    public static void moved(Coordinate initial, Coordinate moved){
      //put a white peg to the moved coordinates and store "has" in the 2d array
      board.putPeg("white", moved.getRow(), moved.getCol());
      pegs[moved.getRow()][moved.getCol()]="has";
      //remove the initial peg and store "n" in the 2d array
      board.removePeg(initial.getRow(), initial.getCol());
      pegs[initial.getRow()][initial.getCol()]="n";

      //initialize two integers which are the row and col differences between the two pegs
      int rowD = moved.getRow() - initial.getRow();
      int colD = moved.getCol() - initial.getCol();

      //use the row and col differences to remove the peg in between them and store an "n"
      if(rowD == 0){
        if(colD > 0){//right direction
          board.removePeg(initial.getRow(), initial.getCol()+1);
          pegs[initial.getRow()][initial.getCol()+1]="n";
        }
        if(colD < 0){//left direction
          board.removePeg(initial.getRow(), initial.getCol()-1);
          pegs[initial.getRow()][initial.getCol()-1]="n";
        }
      }
      if(colD == 0){
        if(rowD > 0){//down direction
          board.removePeg(initial.getRow()+1, initial.getCol());
          pegs[initial.getRow()+1][initial.getCol()]="n";
        }
        if(rowD < 0){//up direction
          board.removePeg(initial.getRow()-1, initial.getCol());
          pegs[initial.getRow()-1][initial.getCol()]="n";
        }
      }
      if(rowD == 2 && colD == 2){//down right direction
          board.removePeg(initial.getRow()+1, initial.getCol()+1);
          pegs[initial.getRow()+1][initial.getCol()+1]="n";
      }
      if(rowD == -2 && colD == -2){//top left direction
          board.removePeg(initial.getRow()-1, initial.getCol()-1);
          pegs[initial.getRow()-1][initial.getCol()-1]="n";
      }
      if(rowD == 2 && colD == -2){//down left direction
          board.removePeg(initial.getRow()+1, initial.getCol()-1);
          pegs[initial.getRow()+1][initial.getCol()-1]="n";
      }
      if(rowD == -2 && colD == 2){//top right direction
          board.removePeg(initial.getRow()-1, initial.getCol()+1);
          pegs[initial.getRow()-1][initial.getCol()+1]="n";
      }
    }

/*------------------the methods in this section are for setting different game styles------------------------------*/
//due to the structure for those methods are the same, so only first one is commented

    public static int putEng() {
        for(int i = 0; i<9; i++){//put string "null" to all index of the 2d array, avoiding null pointer exception
          for(int j = 0; j<9; j++){
            pegs[i][j] = "null";
          }
        }

        //next few for loops put pegs in a specific orientation and store "has" at that index of 2d array
        for(int i = 3; i < 6; i++){
          for(int j = 1; j < 3; j++){
            board.putPeg("white", j, i);
            pegs[j][i] = "has";
          }
        }
        for(int i = 3; i < 6; i++){
          for(int j = 6; j < 8; j++){
            board.putPeg("white", j, i);
            pegs[j][i] = "has";
          }
        }
        for(int i = 1; i < 8; i++){
          for(int j = 3; j < 6; j++){
            board.putPeg("white", j, i);
            pegs[j][i] = "has";
          }
        }

        //next lines are drawing lines on the board for display
        board.drawLine(0, 2, 0, 6);
        board.drawLine(0, 2, 2, 2);
        board.drawLine(2, 2, 2, 0);
        board.drawLine(2, 0, 6, 0);
        board.drawLine(6, 0, 6, 2);
        board.drawLine(6, 2, 8, 2);
        board.drawLine(8, 2, 8, 6);
        board.drawLine(8, 6, 6, 6);
        board.drawLine(6, 6, 6, 8);
        board.drawLine(6, 8, 2, 8);
        board.drawLine(2, 8, 2, 6);
        board.drawLine(2, 6, 0, 6);

        //initialize a integer to store how many pegs are there and return it
        int howMany = 32;
        return howMany;
    }

    public static int putFre() {//this is for the French style section
      for(int i = 0; i<9; i++){
        for(int j = 0; j<9; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 3; i < 6; i++){
        for(int j = 1; j < 3; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 3; i < 6; i++){
        for(int j = 6; j < 8; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 1; i < 8; i++){
        for(int j = 3; j < 6; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      board.putPeg("white", 2, 2);
      board.putPeg("white", 2, 6);
      board.putPeg("white", 6, 2);
      board.putPeg("white", 6, 6);
      pegs[2][2] = "has";
      pegs[2][6] = "has";
      pegs[6][2] = "has";
      pegs[6][6] = "has";
      board.drawLine(0, 3, 0, 5);
      board.drawLine(0, 5, 3, 8);
      board.drawLine(3, 8, 5, 8);
      board.drawLine(5, 8, 8, 5);
      board.drawLine(8, 5, 8, 3);
      board.drawLine(8, 3, 5, 0);
      board.drawLine(5, 0, 3, 0);
      board.drawLine(3, 0, 0, 3);
      int howMany = 36;
      return howMany;
    }

    public static int putEngE() {//this is for the enhanced English style section
      for(int i = 0; i<11; i++){
        for(int j = 0; j<11; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 2; j < 4; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 7; j < 9; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 2; i < 9; i++){
        for(int j = 4; j < 7; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      board.putPeg("white", 1, 5);
      pegs[1][5] = "has";
      board.putPeg("white", 5, 1);
      pegs[5][1] = "has";
      board.putPeg("white", 9, 5);
      pegs[9][5] = "has";
      board.putPeg("white", 5, 9);
      pegs[5][9] = "has";
      board.drawLine(0, 5, 2, 3);
      board.drawLine(2, 3, 3, 3);
      board.drawLine(3, 3, 3, 2);
      board.drawLine(3, 2, 5, 0);
      board.drawLine(5, 0, 7, 2);
      board.drawLine(7, 2, 7, 3);
      board.drawLine(7, 3, 8, 3);
      board.drawLine(8, 3, 10, 5);
      board.drawLine(10, 5, 8, 7);
      board.drawLine(8, 7, 7, 7);
      board.drawLine(7, 7, 7, 8);
      board.drawLine(7, 8, 5, 10);
      board.drawLine(5, 10, 3, 8);
      board.drawLine(3, 8, 3, 7);
      board.drawLine(3, 7, 2, 7);
      board.drawLine(2, 7, 0, 5);
      int howMany = 36;
      return howMany;
    }

    public static int putFreE() {//this is for the enhanced French style section
      for(int i = 0; i<11; i++){
        for(int j = 0; j<11; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 2; j < 4; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 7; j < 9; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      for(int i = 2; i < 9; i++){
        for(int j = 4; j < 7; j++){
          board.putPeg("white", j, i);
          pegs[j][i] = "has";
        }
      }
      board.putPeg("white", 1, 5);
      board.putPeg("white", 5, 1);
      board.putPeg("white", 9, 5);
      board.putPeg("white", 5, 9);
      pegs[1][5] = "has";
      pegs[5][1] = "has";
      pegs[9][5] = "has";
      pegs[5][9] = "has";
      board.putPeg("white", 3, 3);
      board.putPeg("white", 3, 7);
      board.putPeg("white", 7, 3);
      board.putPeg("white", 7, 7);
      pegs[3][3] = "has";
      pegs[3][7] = "has";
      pegs[7][3] = "has";
      pegs[7][7] = "has";
      board.drawLine(0, 5, 5, 0);
      board.drawLine(5, 0, 10, 5);
      board.drawLine(10, 5, 5, 10);
      board.drawLine(5, 10, 0, 5);
      int howMany = 40;
      return howMany;
    }

    public static int putDia() {//this is for the diamond style section
      for(int i = 0; i<10; i++){
        for(int j = 0; j<10; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 4; i < 6; i++){
        for(int j = 2; j < 9; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      for(int i = 3; i < 8; i++){
        board.putPeg("white", 3, i);
        pegs[3][i] = "has";
        board.putPeg("white", 6, i);
        pegs[6][i] = "has";
      }
      for(int i = 4; i < 7; i++){
        board.putPeg("white", 2, i);
        pegs[2][i] = "has";
        board.putPeg("white", 7, i);
        pegs[7][i] = "has";
      }
      board.putPeg("white", 1, 5);
      board.putPeg("white", 8, 5);
      pegs[1][5] = "has";
      pegs[8][5] = "has";
      board.drawLine(0, 5, 4, 1);
      board.drawLine(4, 1, 5, 1);
      board.drawLine(5, 1, 9, 5);
      board.drawLine(9, 5, 5, 9);
      board.drawLine(5, 9, 4, 9);
      board.drawLine(4, 9, 0, 5);
      int howMany = 31;
      return howMany;
    }

    public static int putAsy() {//this is for the asymmetrical style section
      for(int i = 0; i<10; i++){
        for(int j = 0; j<10; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 9; i++){
        for(int j = 3; j < 6; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 1; j < 9; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.drawLine(0, 2, 0, 6);
      board.drawLine(0, 6, 3, 6);
      board.drawLine(3, 6, 3, 9);
      board.drawLine(3, 9, 7, 9);
      board.drawLine(7, 9, 7, 6);
      board.drawLine(7, 6, 9, 6);
      board.drawLine(9, 6, 9, 2);
      board.drawLine(9, 2, 7, 2);
      board.drawLine(7, 2, 7, 0);
      board.drawLine(7, 0, 3, 0);
      board.drawLine(3, 0, 3, 2);
      board.drawLine(3, 2, 0, 2);
      int howMany = 38;
      return howMany;
    }

    public static int putEvF() {//this is for the English vs French style section
      for(int i = 0; i < 7; i++){
        for(int j = 0; j < 7; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 3; i++){
        for(int j = 1; j < 4; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.putPeg("white", 3, 1);
      board.putPeg("white", 3, 2);
      pegs[3][1] = "has";
      pegs[3][2] = "has";
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 7; j++){
          if(pegs[i][j].equals("null")){
            board.putPeg("red", i, j);
          }
        }
      }

      for(int i = 4; i < 6; i++){
        for(int j = 3; j < 6; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.putPeg("white", 3, 4);
      board.putPeg("white", 3, 5);
      pegs[3][4] = "has";
      pegs[3][5] = "has";
      for(int i = 4; i < 7; i++){
        for(int j = 0; j < 7; j++){
          if(pegs[i][j].equals("null")){
            board.putPeg("blue", i, j);
          }
        }
      }

      pegs[3][3]= "n";
      board.drawLine(0, 0, 0, 4);
      board.drawLine(0, 4, 2, 4);
      board.drawLine(2, 4, 2, 6);
      board.drawLine(2, 6, 6, 6);
      board.drawLine(6, 6, 6, 2);
      board.drawLine(6, 2, 4, 2);
      board.drawLine(4, 2, 4, 0);
      board.drawLine(4, 0, 0, 0);
      int howMany = 16;
      return howMany;
    }

    public static int putTri() {//this is for the triangle style section
      for(int i = 0; i < 7; i++){
        for(int j = 0; j < 7; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 6; i++){
        for(int j = 6 - i ; j < 6; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.drawLine(0, 6, 6, 6);
      board.drawLine(6, 6, 6, 0);
      board.drawLine(6, 0, 5, 0);
      board.drawLine(5, 0, 0, 5);
      board.drawLine(0, 5, 0, 6);
      int howMany = 14;
      return howMany;
    }

    public static int putSqr() {//this is for the small square style section
      for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 7; i++){
        for(int j = 1; j < 7; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.drawLine(0, 0, 0, 7);
      board.drawLine(0, 7, 7, 7);
      board.drawLine(7, 7, 7, 0);
      board.drawLine(7, 0, 0, 0);
      int howMany = 35;
      return howMany;
    }

    public static int putSqrL() {//this is for the small large style section
      for(int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 11; i++){
        for(int j = 1; j < 11; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      board.drawLine(0, 0, 0, 11);
      board.drawLine(0, 11, 11, 11);
      board.drawLine(11, 11, 11, 0);
      board.drawLine(11, 0, 0, 0);
      int howMany = 99;
      return howMany;
    }

    public static int putGer() {//this is for the German style sectio
      for(int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
          pegs[i][j] = "null";
        }
      }
      for(int i = 1; i < 10; i++){
        for(int j = 5; j < 8; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      for(int i = 4; i < 7; i++){
        for(int j = 2; j < 11; j++){
          board.putPeg("white", i, j);
          pegs[i][j] = "has";
        }
      }
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 12; j++){
          if(pegs[i][j].equals("null")){
            board.putPeg("black", i, j);
          }
        }
      }
      for(int i = 4; i < 8; i++){
        for(int j = 0; j < 12; j++){
          if(pegs[i][j].equals("null")){
            board.putPeg("red", i, j);
          }
        }
      }
      for(int i = 8; i < 12; i++){
        for(int j = 0; j < 12; j++){
          if(pegs[i][j].equals("null")){
            board.putPeg("yellow", i, j);
          }
        }
      }
      board.drawLine(0, 4, 0, 8);
      board.drawLine(0, 8, 3, 8);
      board.drawLine(3, 8, 3, 11);
      board.drawLine(3, 11, 7, 11);
      board.drawLine(7, 11, 7, 8);
      board.drawLine(7, 8, 10, 8);
      board.drawLine(10, 8, 10, 4);
      board.drawLine(10, 4, 7, 4);
      board.drawLine(7, 4, 7, 1);
      board.drawLine(7, 1, 3, 1);
      board.drawLine(3, 1, 3, 4);
      board.drawLine(3, 4, 0, 4);
      int howMany = 44;
      return howMany;
    }

    public static int forZach(){//feature added for Zach
      for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
          pegs[i][j] = "null";
        }
      }

      board.putPeg("white", 2, 1);
      pegs[2][1] = "has";
      board.putPeg("white", 2, 2);
      pegs[2][2] = "has";
      pegs[2][3] = "n";
      board.drawLine(1, 0, 1, 4);
      board.drawLine(1, 4, 3, 4);
      board.drawLine(3, 4, 3, 0);
      board.drawLine(3, 0, 1, 0);
      int howMany = 2;
      return howMany;
    }
/*------------------next is the main method------------------------------*/

    public static void main(String[] args) {
      int count = 0;//initialize an integer count to indicate how many pegs are left
      boolean hasStart = false;//initialize boolean "hasStart" to false to indicate if user picked a starting point or not

      //next few if statements call different peg setting methods refering to different sizes user chose
      //it also store the value returned from the peg setting methods into "count"
      if(size == 9){
        count = putEng();
      }
      else if(size == -9){
        count = putFre();
      }
      else if(size == 11){
        count = putEngE();
      }
      else if(size == -11){
        count = putFreE();
      }
      else if(size == 10){
        count = putDia();
      }
      else if(size == -10){
        count = putAsy();
      }
      else if(size == 7){//in this game style, there is only one starting point, therefore hasStart is true
        count = putEvF();
        hasStart=true;
      }
      else if(size == -7){
        count = putTri();
      }
      else if(size == 8){
        count = putSqr();
      }
      else if(size == 12){
        count = putSqrL();
      }
      else if(size == -12){
        count = putGer();
      }
      else if(size == 5){
        count = forZach();
        hasStart=true;
      }

      while(!hasStart){//if the game hasn't start
        board.displayMessage("Click To Pick a Starting Point.");//display message to ask user to start
        Coordinate start = board.getClick();//get the coordinate from user's click
        if(!pegs[start.getRow()][start.getCol()].equals("has")){//if it's an invalid starting point, hasStart is still false, repeat the loop
        }
        else{//if it is a possible starting point, call the start method, hasStart is now true
          start(start);
          hasStart = true;
        }
      }
      //display game is started message
      if(size==5){
        board.displayMessage("Zach, This Is For You, You Can Do This!");
      }
      else if(size==7){
        board.displayMessage("Special Rule: You'll win with 2 pegs left this time.");
      }
      else{
        board.displayMessage("Let's start the game!");
      }

      boolean win = false;//initializing boolean "win" to indicate when to end the game
      while(!win){//while the user didn't win the game

        boolean hasMove = false;//initializing boolean "hasMove" to indicate if a clicked peg is moved or not
        while(!hasMove){//when no peg has moved, run following codes.

          Coordinate click = board.getClick();//get the current clicking coordinate

          if(!pegs[click.getRow()][click.getCol()].equals("has")){}//if user didn't click a peg, hasMove is still false, repeat the loop

          else{//if user clicked a peg
            current(click);//call the current method to notice user which is the selected peg
            board.displayMessage(" ");

            boolean change = true;//(added feature) for user to change selected peg
            while(change){//while change is true

              Coordinate move = board.getClick();//store user's second click after selecting a peg as the "move" coordinate

              //if user's move is the selected, cancle the selected effect,stop the change loop
              if(click.getRow() == move.getRow() && click.getCol() == move.getCol()){
                  board.putPeg("white", move.getRow(), move.getCol());
                  change = false;
              }

              //if user's move is another peg, change the selected peg to the new peg, repeat this loop to ask for the second click
              else if(pegs[move.getRow()][move.getCol()].equals("has")){
                  board.putPeg("white", click.getRow(), click.getCol());
                  click = move;
                  current(click);
              }

              //if the move is legal, call the "moved" method and end both "change" loop and "hasMove" loop, the remaining peg minus 1
              else if(isLegal(click,move)){
                  moved(click, move);
                  count--;
                  change = false;
                  hasMove = true;
              }

              //if it's not legal move, print out invalid move message, then stop the change loop and repeat the hasMove loop
              else{
                  board.displayMessage("Invalid Move! Try Again.");
                  board.putPeg("white", click.getRow(), click.getCol());
                  change = false;
              }
            }

          }

        }

        //if there is two remaining pegs and it's French vs English style, end the "win" loop
        if(count == 2 && size == 7){
          win = true;
        }
        //if there is only one remaining peg, end the "win" loop
        else if(count==1){
          win = true;
        }

        int noMove = 0;//initialize the integer noMove to count how many pegs don't have possible moves
        for(int i = 0; i < Math.abs(size); i++){//check all pegs on the board to see if they have possible moves in order to indicate if the user lost or not
          for(int j = 0; j < Math.abs(size); j++){

            if(pegs[i][j].equals("has")){//only check if there is a peg
              Coordinate checker= new Coordinate(i,j);//initialize the "checker" coordinate to check the peg

              if(!moreMoves(checker)){//call "moreMoves" method, if there is no more moves, noMove plus one
                noMove++;
              }
              if(noMove == count){//if all the remaining pegs have no moves, end the win loop and checking loop
                win = true;
                i = Math.abs(size);
                j = Math.abs(size);
              }
            }

          }
        }
      }

      //next few lines are printing out ENDGAME messages.
      if(count==1 && size==5){
        board.displayMessage("ZACH! You did it! You win! Proud of you!");
      }
      else if(count==1 && size==-7){
        board.displayMessage("Wow! You beat the most difficult one! I'm impressed.");
      }
      else if(count==1){
        board.displayMessage("Genius! Flawless Victory!");
      }
      else if(count==2 && size==7){
        board.displayMessage("Well, You Win, I Made This Style Up. It Sucks, I Know.");
      }
      else if(count==2){
        board.displayMessage("So Close! Only 2 Pegs Left!");
      }
      else if(count==3){
        board.displayMessage("Not Bad, 3 Is A Solid Number.");
      }
      else if(count==4){
        board.displayMessage("4 Left? Better Luck Next Time.");
      }
      else if(count==5){
        board.displayMessage("Well, 5 is An Average");
      }
      else if(count==6){
        board.displayMessage("6 Isn't That Bad, A For the Effort...");
      }
      else if(count==7){
        board.displayMessage("7 Pegs, Nice Try, Butterfly.");
      }
      else if(count==8){
        board.displayMessage("8 is A Lot, Trust Me, You Are Not Dummy, Just Unlucky");
      }
      else if(count==9){
        board.displayMessage("9, Really???");
      }
      else if(count==10){
        board.displayMessage("Is 10 Even Possible??? ???");
      }
      else{
        board.displayMessage("You Are A Genius In Trying To Lose, Gotta Give It To You.");
      }
    }

}
