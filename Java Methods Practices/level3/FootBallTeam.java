package level3;

import java.util.Arrays;
public class FootBallTeam {
	    public static int[] generateHeights(int size) {
	        int[] heights = new int[size];
	        for (int i = 0; i < size; i++) {
	            heights[i] = 150 + (int) (Math.random() * 101);
	        }
	        return heights;
	    }
	    public static int findSum(int[] heights) {
	        int sum = 0;
	        for (int h : heights) {
	            sum += h;
	        }
	        return sum;
	    }

	    public static double findMean(int[] heights) {
	        return (double) findSum(heights) / heights.length;
	    }

	    public static int findShortest(int[] heights) {
	        int min = heights[0];
	        for (int h : heights) {
	            min = Math.min(min, h);
	        }
	        return min;
	    }

	    public static int findTallest(int[] heights) {
	        int max = heights[0];
	        for (int h : heights) {
	            max = Math.max(max, h);
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int teamSize = 11;

	        int[] heights = generateHeights(teamSize);
	        System.out.println("Heights of football players (in cm): " + Arrays.toString(heights));
	        int shortest = findShortest(heights);
	        int tallest = findTallest(heights);
	        double mean = findMean(heights);

	        System.out.println("Shortest height: " + shortest + " cm");
	        System.out.println("Tallest height: " + tallest + " cm");
	        System.out.printf("Mean height: %.2f cm\n", mean);
	    }
	

}
