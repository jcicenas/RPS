public class Player {
    String identity;
    String move;
    int nMove;
    public Player(String identity){
        this.identity = identity;
        this.move = null;
    }

    public int convertToNum(){
        if(this.move.equalsIgnoreCase("R")){
            nMove = 1;
            move = "Rock";
        }else if(this.move.equalsIgnoreCase("P")){
            nMove = 2;
            move = "Paper";
        }else if(this.move.equalsIgnoreCase("S")){
            nMove = 3;
            move = "Scissors";
        }
        return nMove;
    }
    

}
