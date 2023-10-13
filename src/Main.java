import java.util.*;
public class Main {
    Player playera = new Player("A");
    Player playerb = new Player("B");
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Main m1 = new Main();
        String temp;
        boolean sentinel = true;
        do{
            m1.ynloop();
            if((m1.playera.nMove - m1.playerb.nMove) == 1){
                System.out.println(m1.playera.move + " beats " + m1.playerb.move);
                System.out.println("Player A Wins!");
            }else if(m1.playera.nMove == m1.playerb.nMove){
                System.out.println("Tie");
            }else{
                System.out.println(m1.playerb.move + " beats " + m1.playera.move);
                System.out.println("Player B Wins!");
            }
            System.out.println("Play again? Y/N");
            temp = m1.scan.nextLine();
            if(temp.equalsIgnoreCase("N")){
                sentinel = false;
            }
        }while(sentinel);
    }
    public void ynloop(){
        boolean sentinel = true;
        do {
            String temp;
            System.out.println("Enter a move for player " + playera.identity + " in format R P S");
            temp = scan.nextLine();
            if(temp.equalsIgnoreCase("R") || temp.equalsIgnoreCase("S") || temp.equalsIgnoreCase("P")){
                
                playera.move = temp;
                playera.convertToNum();
                sentinel = false;
            }
        } while (sentinel);
        sentinel = true;
        do {
            String temp;
            System.out.println("Enter a move for player " + playerb.identity + " in format R P S");
            temp = scan.nextLine();
            if(temp.equalsIgnoreCase("R") || temp.equalsIgnoreCase("S") || temp.equalsIgnoreCase("P")){
                playerb.move = temp;
                playerb.convertToNum();
                sentinel = false;
            }
        } while (sentinel);
    }
}