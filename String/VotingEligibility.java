package stringlevel2;

public class VotingEligibility {
	 public static int[] getAges(int n) {
	        Scanner scanner = new Scanner(System.in);
	        int[] ages = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = scanner.nextInt();
	        }
	        return ages;
	    }
	    public static String[][] checkVotingEligibility(int[] ages) {
	        String[][] result = new String[ages.length][2];
	        for (int i = 0; i < ages.length; i++) {
	            result[i][0] = String.valueOf(ages[i]);
	            if (ages[i] < 0) {
	                result[i][1] = "Invalid Age";
	            } else if (ages[i] >= 18) {
	                result[i][1] = "true";
	            } else {
	                result[i][1] = "false";
	            }
	        }
	        return result;
	    }
	    public static void displayResult(String[][] result) {
	        System.out.println("Age\tEligible to Vote");
	        for (String[] row : result) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        int[] ages = getAges(n);
	        String[][] result = checkVotingEligibility(ages);
	        displayResult(result);
	    }

}
