import java.util.ArrayList;
import java.util.Scanner;

public class logicDriver {
    Scanner in = new Scanner(System.in);
    Integer bet;
    ArrayList<Integer> userList = new ArrayList<Integer>();

    char command = '\0';
		while (command != 'q') {
        System.out.println("Enter a bet amount: ");
        bet = in.nextInt();
        int winnings = 0;
        System.out.println("Enter 1/4/8/10 to choose a game or q to quit.");
        int game = in.nextInt();
        userList.clear();
        System.out.println("Enter number selections: ");
        for (int i = 0; i < game; ++i) {
            userList.add(in.nextInt());
        }
        KenoLogic k = new KenoLogic(bet, userList);
        k.generateDrawings();
        k.printVals();
        if (game == 1) {
            winnings = k.oneSpotGame();
        } else if (game == 4) {
            winnings = k.fourSpotGame();
        } else if (game == 8) {
            winnings = k.eightSpotGame();
        } else if (game == 10) {
            winnings = k.tenSpotGame();
        }
        System.out.println();
        System.out.print("Winnings: ");
        System.out.println(winnings);
        System.out.println("Enter p to play or q to quit: ");
        command = in.next().charAt(0);
    }
}

