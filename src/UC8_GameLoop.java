public class UC8_GameLoop {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    static int moves = 0;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                moves++;
                isHumanTurn = false;

            } else {
                System.out.println("Computer's turn");
                moves++;
                isHumanTurn = true;
            }

            if (moves >= 9) {
                System.out.println("Game Draw!");
                gameOver = true;
            }
        }

        System.out.println("Game Over");
    }
}