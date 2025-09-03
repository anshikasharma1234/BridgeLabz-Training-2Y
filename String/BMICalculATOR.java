package stringlevel3;

public class BMICalculATOR {
	 public static String[] calculateBMI(double weight, double height) {
	        double heightInMeters = height / 100; // Convert cm to meters
	        double bmi = weight / (heightInMeters * heightInMeters);
	        String status;
	        if (bmi < 18.5) {
	            status = "Underweight";
	        } else if (bmi < 25) {
	            status = "Normal";
	        } else if (bmi < 30) {
	            status = "Overweight";
	        } else {
	            status = "Obese";
	        }
	        String[] result = new String[4];
	        result[0] = String.valueOf(height);
	        result[1] = String.valueOf(weight);
	        result[2] = String.format("%.2f", bmi);
	        result[3] = status;
	        return result;}
	    public static String[][] calculateBMIs(double[][] heightWeight) {
	        String[][] results = new String[heightWeight.length][4];
	        for (int i = 0; i < heightWeight.length; i++) {
	            String[] result = calculateBMI(heightWeight[i][0], heightWeight[i][1]);
	            results[i][0] = result[0];
	            results[i][1] = result[1];
	            results[i][2] = result[2];
	            results[i][3] = result[3];
	        }
	        return results;
	    }
	    public static void displayResults(String[][] results) {
	        System.out.println("Height (cm)\tWeight (kg)\tBMI\tStatus");
	        for (String[] result : results) {
	            System.out.println(result[0] + "\t\t" + result[1] + "\t\t" + result[2] + "\t" + result[3]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[][] heightWeight = new double[10][2];
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
	            heightWeight[i][0] = scanner.nextDouble();
	            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
	            heightWeight[i][1] = scanner.nextDouble();
	        }
	        String[][] results = calculateBMIs(heightWeight);
	        displayResults(results);
	    }
	}

