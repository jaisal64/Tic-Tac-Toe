import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome. Input 1 to play Tic Tac Toe or 2 for Order and Chaos");
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();

        if(g==1){

        String run = "y";

// initializing game conditions common to both games


        player one = new player();
        player two = new player();

        one.setName("One");
        two.setName("Two");

        one.setPlaySymbol("X");
        two.setPlaySymbol("O");

        inGame ticTac = new inGame();
        victoryChecker check = new victoryChecker();

        while (run.equals("y")) {

            System.out.println("Welcome to Tic Tac Toe. For NxN playing area");
            System.out.println("Enter a number N");

            int playSize = s.nextInt();

            if (playSize < 3 ) {
                System.out.println("Please enter appropriate number");
                playSize = s.nextInt();
            }


            gameBoard ticTacBoard = new gameBoard(playSize);

            ticTacBoard.printBoard();

            boolean status = false;

            int moveCount = 0;

            while (!status) {
                ticTac.NextMove(one, ticTacBoard);
                status = check.winCheck(ticTacBoard, one);
                ticTacBoard.printBoard();
                moveCount++;
                if (status) {
                    one.wins++;
                    System.out.println("Player one is the winner. Congratulation!");
                    System.out.println("Player one wins:" + one.wins);
                    System.out.println("Player two wins:" + two.wins);
                    System.out.println("Type y to play again or n to exit");
                    run = s.next();
                    break;

                }

                if (moveCount == playSize * playSize) {
                    System.out.println("Match has ended in a draw!");
                    System.out.println("Player one wins:" + one.wins);
                    System.out.println("Player two wins:" + two.wins);
                    System.out.println("Type y to play again or n to exit");
                    run = s.next();
                    break;
                }
                ticTac.NextMove(two, ticTacBoard);
                status = check.winCheck(ticTacBoard, two);
                ticTacBoard.printBoard();
                moveCount++;
                if (status) {
                    two.wins++;
                    System.out.println("Player one is the winner. Congratulation!");
                    System.out.println("Player one wins:" + one.wins);
                    System.out.println("Player two wins:" + two.wins);
                    System.out.println("Type y to play again or n to exit");
                    run = s.next();
                    break;
                }

                if (moveCount == playSize * playSize) {
                    System.out.println("Match has ended in a draw!");
                    System.out.println("Player one wins:" + one.wins);
                    System.out.println("Player two wins:" + two.wins);
                    System.out.println("Type y to play again or n to exit");
                    run = s.next();
                    break;
                }


            }
        }
    }
    /* Code for Order and Chaos*/

    else if (g == 2){
            String run = "y";


            player one = new player();
            player two = new player();

            one.setName("One (X)");
            two.setName("Two (O)");


            inGame oC = new inGame();
            victoryChecker oCheck = new victoryChecker();

            while (run.equals("y")) {

                System.out.println("Welcome to Order and Chaos");

                gameBoard orderChaos = new gameBoard(6);

                orderChaos.printBoard();

                boolean status = false;

                int moveCount = 0;

                while (!status) {
                    System.out.println("Player 1(Order):Input 1 for X or 2 for O");
                    g = s.nextInt();
                    while(g>2){
                        System.out.println("Incorrect Input.Player 1(Order):Input 1 for X or 2 for O");
                        g = s.nextInt();
                    }

                    if(g==1){
                        one.playSymbol="X";
                    } else if (g==2) {
                        one.playSymbol="O";
                    }
                    oC.NextMove(one, orderChaos);
                    status = oCheck.orderChaosCheck(orderChaos, one);
                    orderChaos.printBoard();
                    moveCount++;
                    if (status) {
                        one.wins++;
                        System.out.println("Player one is the winner. Congratulation!");
                        System.out.println("Player one wins:" + one.wins);
                        System.out.println("Player two wins:" + two.wins);
                        System.out.println("Type y to play again or n to exit");
                        run = s.next();
                        break;

                    }


                    System.out.println("Player 2(chaos):Input 1 for X or 2 for O");
                    g = s.nextInt();
                    while(g>2 ){
                        System.out.println("Incorrect input.Player 1(Order):Input 1 for X or 2 for O ");
                        g = s.nextInt();
                    }

                    if(g==1){
                        two.playSymbol="X";
                    } else if (g==2) {
                        two.playSymbol="O";
                    }
                    oC.NextMove(two, orderChaos);
                    status = oCheck.orderChaosCheck(orderChaos, two);
                    orderChaos.printBoard();
                    moveCount++;


                    if (moveCount == 36) {
                        two.wins++;
                        System.out.println("Player 2:Chaos has won");
                        System.out.println("Player one wins:" + one.wins);
                        System.out.println("Player two wins:" + two.wins);
                        System.out.println("Type y to play again or n to exit");
                        run = s.next();
                        break;
                    }


                }
            }

        }
    }
}