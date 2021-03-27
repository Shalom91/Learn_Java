public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int p1Number = 0;
        int p2Number = 0;
        int p3Number = 0;

        boolean p1Guess = false;
        boolean p2Guess = false;
        boolean p3Guess = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("The number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            p1Number = p1.number;
            System.out.println("Player one guessed " + p1Number);

            p2Number = p2.number;
            System.out.println("Player two guessed " + p2Number);

            p3Number = p3.number;
            System.out.println("Player three guessed " + p3Number);

            if (p1Number == targetNumber) {
                p1Guess = true;
            }
            if (p2Number == targetNumber) {
                p2Guess = true;
            }
            if (p3Number == targetNumber) {
                p3Guess = true;
            }

            if (p1Guess || p2Guess || p3Guess) {
                System.out.println("Congratulations we have a winner!");
                System.out.println("Player one's guess is " + p1Guess);
                System.out.println("Player two's guess is " + p2Guess);
                System.out.println("Player three's guess is " + p3Guess);
                System.out.println("Game Over!");
                break;



            } else {
                System.out.println("Players have to play again!");

            }


        }

    }

}


