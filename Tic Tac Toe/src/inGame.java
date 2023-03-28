import java.util.InputMismatchException;
import java.util.Scanner;

public class inGame {

    Scanner p = new Scanner(System.in);
    int moveCount = 0;

    public void NextMove(player a, gameBoard b) {



        int pos=0;
        try{
            System.out.println("Enter Position for " + a.playSymbol);
            pos = p.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Please enter correct input");
            pos = p.nextInt();
        }


        int x = pos/b.length;
        int y = pos%b.length;

        /* Checking that move is legal*/

        while( pos > (b.length*b.length-1)|| b.board[x][y].equals("X") || b.board[x][y].equals("O")) {
            System.out.println("Enter CORRECT Position for Player" + a.name);

            pos = p.nextInt();
            x = pos / b.length;
            y = pos % b.length;

        }
        if (0 <= pos && pos < (b.length) * (b.length)) {
            b.updateBoard(pos, a, b.getBoard());
        }

    }
}

