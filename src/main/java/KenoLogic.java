import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class KenoLogic {
    private ArrayList<Integer> userList;
    private LinkedHashSet<Integer> drawings = new LinkedHashSet<Integer>();
    private Integer bet;
    private Random rand = new Random();

    public KenoLogic(int userBet, ArrayList<Integer> userList) {
        bet = userBet;
        this.userList = userList;
    }

    public void generateDrawings() {
        while (drawings.size() != 20) {
            drawings.add(rand.nextInt(80));
        }
    }

    private int determineMatches() {
        int matchCount = 0;
        for (int i = 0; i < userList.size(); i++) {
            if (drawings.contains(userList.get(i))) {
                    matchCount++;
            }
        }
        return matchCount;
    }

    public void printVals() {
        System.out.println("Random Values: ");

        for (Integer x :
                drawings) {
            System.out.print(x + ", ");
        }

        System.out.println();

        System.out.println("User Values: ");

        for (Integer x :
                userList) {
            System.out.print(x + ", ");
        }
    }

    public int oneSpotGame() {
        int match = determineMatches();
        if (match == 1) {
            return bet * 2;
        }
        return 0;
    }

    public int fourSpotGame() {
        int match = determineMatches();
        if (match == 2) {
            return bet;
        } else if (match == 3) {
            return bet * 5;
        } else if (match == 4) {
            return bet * 75;
        }
        return 0;
    }

    public int eightSpotGame() {
        int match = determineMatches();
        if (match == 4) {
            return bet * 2;
        } else if (match == 5) {
            return bet * 12;
        } else if (match == 6) {
            return bet * 50;
        } else if (match == 7) {
            return bet * 750;
        } else if (match == 8) {
            return bet * 10000;
        }
        return 0;
    }

    public int tenSpotGame() {
        int match = determineMatches();
        if (match == 0) {
            return bet * 5;
        } else if (match == 5) {
            return bet * 2;
        } else if (match == 6) {
            return bet * 15;
        } else if (match == 7) {
            return bet * 40;
        } else if (match == 8) {
            return bet * 450;
        } else if (match == 9) {
            return bet * 4250;
        } else if (match == 10) {
            return bet * 100000;
        }
        return 0;
    }
}
