package stringlevel2;

public class RockPaperSciccors {
	 public static String getComputerChoice() {
	        String[] choices = { "rock", "paper", "scissors" };
	        int index = (int) (Math.random() * 3);
	        return choices[index];
	    }
	    public static String determineWinner(String userChoice, String computerChoice) {
	        if (userChoice.equals(computerChoice)) {
	            return "Tie";
	        }
	        switch (userChoice) {
	            case "rock":
	                return computerChoice.equals("scissors") ? "User" : "Computer";
	            case "paper":
	                return computerChoice.equals("rock") ? "User" : "Computer";
	            case "scissors":
	                return computerChoice.equals("paper") ? "User" : "Computer";
	            default:
	                return "Invalid Choice";
	        }
	    }
	    public static String[][] calculateWinPercentage(int userWins, int computerWins, int ties, int totalGames) {
	        double userWinPercentage = ((double) userWins / totalGames) * 100;
	        double computerWinPercentage = ((double) computerWins / totalGames) * 100;
	        String[][] result = new String[3][2];
	        result[0][0] = "User Wins";
	        result[0][1] = userWins + " (" + String.format("%.2f", userWinPercentage) + "%)";
	        result[1][0] = "Computer Wins";
	        result[1][1] = computerWins + " (" + String.format("%.2f", computerWinPercentage) + "%)";
	        result[2][0] = "Ties";
	        result[2][1] = ties + " (" + String.format("%.2f", ((double) ties / totalGames) * 100) + "%)";
	        return result;
	    }
	    public static void displayResults(String[][] results) {
	        System.out.println("Results:");
	        for (String[] result : results) {
	            System.out.println(result[0] + ": " + result[1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of games: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume newline left-over

	        int userWins = 0;
	        int computerWins = 0;
	        int ties = 0;

	        String[][] gameResults = new String[n][3];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter your choice (rock/paper/scissors): ");
	            String userChoice = scanner.nextLine().toLowerCase();
	            String computerChoice = getComputerChoice();
	            String winner = determineWinner(userChoice, computerChoice);

	            gameResults[i][0] = "Game " + (i + 1);
	            gameResults[i][1] = "User: " + userChoice + ", Computer: " + computerChoice;
	            gameResults[i][2] = "Winner: " + winner;

	            if (winner.equals("User")) {
	                userWins++;
	            } else if (winner.equals("Computer")) {
	                computerWins++;
	            } else {
	                ties++;
	            }
	        }

	        System.out.println("Game Results:");
	        for (String[] result : gameResults) {
	            System.out.println(result[0] + ": " + result[1] + ", " + result[2]);
	        }

	        String[][] winPercentage = calculateWinPercentage(userWins, computerWins, ties, n);
	        displayResults(winPercentage);
	    }
}
