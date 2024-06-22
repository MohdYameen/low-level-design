package tiktactoe;

public class Main {

    public static void main(String args[]) {
        TictacToeGame game =  new TictacToeGame();
        game.initializeGame();
        System.out.println("Game winner is: " + game.startGame());
    }

}
